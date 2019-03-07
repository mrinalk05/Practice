package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Firefox {

	@Test(invocationCount = 4)
	public void normal() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:Pa55w0rd@test.sandandsky.com");
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		driver.findElement(By.xpath(".//*[@id='product_16']/div/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath(".//*[@id='checkout-link']")).click();
		driver.findElement(By.xpath(".//*[@id='order_email']")).sendKeys("mrinal.kumar@supernova.xyz");
		// driver.findElement(By.xpath(".//*[@id='checkout_form_registration']/p[2]/input")).click();
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_firstname']")).sendKeys("mrinal");
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_address1']")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_city']")).sendKeys("Sabana");
		WebElement country = driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_country_id']"));
		Select sel = new Select(country);
		sel.selectByValue("50");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement state =
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_state_id']"));
		Select s = new Select(state);
		s.selectByValue("613");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_zipcode']")).sendKeys("40501");
		driver.findElement(By.xpath(".//*[@id='order_bill_address_attributes_phone']")).sendKeys("9990123767");
		driver.findElement(By.xpath(".//*[@id='checkout_form_address']/div[3]/input")).click();
		driver.findElement(By.xpath(".//*[@id='payment-method-fields']/li[2]/label")).click();
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4242 4242 4242 4242 4242");
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4242 4242 4242 4242 4242");
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4242 4242 4242 4242 4242");
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4242 4242 4242 4242 4242");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='card_expiry']")).sendKeys("08");
		driver.findElement(By.xpath(".//*[@id='card_expiry']")).sendKeys("18");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='card_code']")).sendKeys("737");
		RemoteWebDriver r = (RemoteWebDriver) driver;
		String j = "window.scrollTo(0,600)";
		r.executeScript(j);
		driver.findElement(By.xpath(".//*[@id='checkout_form_payment']/div[2]/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String n = driver.findElement(By.xpath(".//*[@id='order_summary']/h1")).getText();
		System.out.println(n);
		driver.quit();
	}
}
