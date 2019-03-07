package driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sandandsky {

	@Test
	public void Checkout() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandandsky-staging.herokuapp.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		RemoteWebDriver r = (RemoteWebDriver) driver;
		String J = "window.scrollTo(" + Integer.toString(0) + "," + Integer.toString(1000) + ")";
		r.executeScript(J);
		driver.findElement(By.cssSelector("#mask button")).click();
		// driver.findElement(By.xpath("(//button[contains(text(),'Add')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='checkout-link']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//*[@id='order_email']")).sendKeys("vikrant@gmail.com");
		driver.findElement(By.cssSelector("#order_ship_address_attributes_firstname")).sendKeys("vikrant");
		driver.findElement(By.cssSelector("#order_ship_address_attributes_lastname")).sendKeys("luthra");
		driver.findElement(By.cssSelector("#order_ship_address_attributes_phone")).sendKeys("0999939");
		WebElement country = driver.findElement(By.id("order_ship_address_attributes_country_id"));
		Select sel = new Select(country);
		sel.selectByValue("13");
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.cssSelector("#order_ship_address_attributes_state_id"));
		Select sel1 = new Select(state);
		if (state.isDisplayed()) {
			try {
				sel1.selectByIndex(2);
			} catch (Exception e) {

			}
		}
		driver.findElement(By.xpath(".//*[@id='order_ship_address_attributes_address1']")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='order_ship_address_attributes_address2']")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='order_ship_address_attributes_city']")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='order_ship_address_attributes_zipcode']")).sendKeys("test");
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Visa/Master']")).click();
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("(//iframe)[1]"));
		WebDriverWait f = new WebDriverWait(driver, 30);
		f.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("//input[@id='cardholderName']")).sendKeys("mrinal");
		WebElement WpExp = driver.findElement(By.xpath("//select[@id='expiryMonth']"));
		Select mo = new Select(WpExp);
		mo.selectByValue("08");
		WebElement Wpyr = driver.findElement(By.xpath("//select[@id='expiryYear']"));
		Select yr = new Select(Wpyr);
		yr.selectByValue("2021");
		driver.findElement(By.xpath("//input[@id='securityCode']")).sendKeys("737");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(5000);
		String orderno = driver.findElement(By.xpath("//span[contains(text(),'#')]")).getText();
		System.out.println(orderno);
		driver.quit();
	}
}
