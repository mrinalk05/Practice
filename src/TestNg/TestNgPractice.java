package TestNg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import driver.Firefox;

public class TestNgPractice {
	
	
	@Test
	public void A2 () {
		System.out.println("A2"+ Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void A1 () {
		System.out.println("A1"+Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void A3 () {
		System.out.println("A3"+Thread.currentThread().getId());
//		WebDriver driver = new FirefoxDriver();
//		Dimension d = new Dimension(0, 800);
//		System.out.println(d);
//		driver.manage().window().setSize(d);
	}
}
