package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	@Test
	public void headless(){
		WebDriver driver= new PhantomJSDriver();
		driver.get("https://www.facebook.com");
		String m = driver.getTitle();
		System.out.println(m);
	}

}
