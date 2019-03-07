package driver;


import org.openqa.selenium.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	 
	public class Link {	 
		public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {	 
			WebDriver driver= new ChromeDriver();
			Dimension d = new Dimension(375, 667);
			driver.manage().window().setSize(d);
		    driver.get("https://www.bodyboss.com");
		    Thread.sleep(10000);
		    // Grab all the anchor tags on the page you're currently on.
		    List<WebElement> anchors = driver.findElements(By.tagName("img"));	
		    // Create a 2nd List to hold the URLs of the anchor tags.
		   // List<String> allURLs = new ArrayList<String>();
		    // Iterate through all the anchors that you got.
		    for (WebElement a : anchors) {		    	
		    	URLConnection urlConnection = new URL(a.getAttribute("src")).openConnection();									
		    	int size=urlConnection.getContentLength()/1000;
		    	System.out.println(a.getAttribute("src")+","+size);
//		    	if(size>=50){
//		        // Print out the URL of the anchor.
//		        System.out.println(a.getAttribute("src")+","+size);
//		    	}
//		        System.out.println();}

		        // Store the URL of the List.
//		        allURLs.add(a.getAttribute("src"));
		    }
			
	 driver.close();
		}
	
	 
	}

	
