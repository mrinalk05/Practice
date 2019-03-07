package driver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyLinks {

	@Test
	public void brokenimage()
	{
		WebDriver driver=new FirefoxDriver();
		//Dimension d = new Dimension(375,600);
		
		//driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		
		driver.get("http://admin:Pa55w0rd@test.sandandsky.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		int i;
		
		for( i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			//String url1=ele.getAttribute("alt src");

			
			verifyLinkActive(url);
			//verifyLinkActive(url1);
			//driver.quit();
			
		}
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
                 Reporter.log(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()!=200)  
           {
        	  Reporter.log(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	
	 

}