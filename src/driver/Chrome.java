package driver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Chrome {
	public static void main(String[] args) throws InterruptedException{
        // Create object of HashMap Class
		HashMap <String, Object> prefs = new HashMap<String, Object>();
              
                // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
 
                // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
 
                // Set the experimental option
		options.setExperimentalOption("prefs", prefs);
 
                // pass the options object in Chrome driver
 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}
}
