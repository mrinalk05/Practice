package Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cricket {
	
	
	@Test
	public void cric() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cricket"+ Keys.ENTER);
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		 System.out.println(link.size());
		
		 for (int i=0; i<link.size(); i++) {
			 try {
			if( link.get(i).getAttribute("href").contains("cricket")) {
				System.out.println(link.get(i).getAttribute("href"));
				
			}
			}
			 catch(NullPointerException e) {
				 
			 }
		 }
			driver.quit();
		
		
		
	}
	

}


