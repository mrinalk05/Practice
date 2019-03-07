package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Currency {

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://skinnymint-staging.herokuapp.com");
	driver.findElement(By.xpath(".//*[@id='optinPopup']/div/div/div/button")).click();
	driver.findElement(By.xpath(".//*[@id='s2id_currency']/a/span[2]"));
	while(true){
		try{
			driver.findElement(By.xpath(".//*[@id='s2id_currency']/a/span[2]")).click();
			break;
			}
		catch(Throwable t){
			
			}
	}

	}

}
