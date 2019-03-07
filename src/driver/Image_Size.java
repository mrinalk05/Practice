package driver;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.print.attribute.AttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Image_Size {
	
	@Test
	public void ss() throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver();
		List<WebElement> listofimages = driver.findElements(By.tagName("img"));
		  for(WebElement d : listofimages){

		 URLConnection urlConnection = new URL(d.getAttribute("src")).openConnection();
		 int size = urlConnection.getContentLength();}
		 //get the locator to image here
		 List<WebElement> we = driver.findElements(By.tagName("img"));

		 URLConnection urlConnection = new URL(((WebElement) we).getAttribute("src")).openConnection();
		 int size = urlConnection.getContentLength();
		 System.out.println(size);

		}
}