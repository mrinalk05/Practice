package driver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutoSuggestions {
	@Test
	public void Spree() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bodyboss-development.herokuapp.com/admin");
		driver.findElement(By.xpath(".//*[@id='spree_user_email']")).sendKeys("admin@bodyboss.com");
		driver.findElement(By.xpath(".//*[@id='spree_user_password']")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='new_spree_user']/div[4]/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(@class,'index-filters')]")).click();
		 driver.findElement(By.id("q_created_at_gt")).click();//to click on thedate picker field
		    String date_ent = "30-Oct-2017";
		    String date_ent1[] = date_ent.split("-");
		    String shipFDay = date_ent1[0];
		    String shipFMonth = date_ent1[1];
		    String shipFYear = date_ent1[2];
		 String date_pres = driver.findElement(By.xpath("//th[@title='Select Month']")).getText();
		 System.out.println(date_pres);
		    String dp[] = date_pres.split(" ");
		  //  String month_pres = dp[0];
		    String year_pres = dp[1];
		    if (year_pres.equals(shipFYear)) {
		        driver.findElement(By.xpath("//th[@title='Select Month']")).click();

		        driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();
		        Thread.sleep(5000);

		    } 
		    else if (Integer.parseInt(year_pres) > Integer.parseInt(shipFYear)) {
		        driver.findElement(By.xpath("//th[@title='Select Month']")).click();

		        while (2 > 1) {
		            year_pres = driver.findElement(By.xpath("//th[@title='Select Year']")).getText();
		            if (year_pres.equalsIgnoreCase(shipFYear)) {

		                driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();
		                Thread.sleep(5000);
		                break;
		            }
		            driver.findElement(By.xpath("//span[@title='Previous Year']")).click();
		        }

		    } 
		    else {
		        driver.findElement(By.xpath("//th[@title='Select Month']")).click();
		        while (2 > 1) {
		            year_pres = driver.findElement(By.xpath("//th[@title='Select Year']")).getText();
		            if (year_pres.equalsIgnoreCase(shipFYear)) {

		                driver.findElement(By.xpath("//span[contains(.,'" + shipFMonth + "')]")).click();

		                Thread.sleep(5000);
		                break;
		            }
		            driver.findElement(By.xpath("//span[@title='Next Year']")).click();
		        }
		    }

		    switch (shipFMonth) {
		    case "Jan": {
		        driver.findElement(By.xpath("//td[@data-day='01/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }

		    case "Feb": {
		        driver.findElement(By.xpath("//td[@data-day='02/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Mar": {
		        driver.findElement(By.xpath("//td[@data-day='03/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Apr": {
		        driver.findElement(By.xpath("//td[@data-day='04/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "May": {
		        driver.findElement(By.xpath("//td[@data-day='05/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Jun": {
		        driver.findElement(By.xpath("//td[@data-day='06/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Jul": {
		        driver.findElement(By.xpath("//td[@data-day='07/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Aug": {
		        driver.findElement(By.xpath("//td[@data-day='08/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Sep": {
		        driver.findElement(By.xpath("//td[@data-day='09/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Oct": {
		        driver.findElement(By.xpath("//td[@data-day='10/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Nov": {
		        driver.findElement(By.xpath("//td[@data-day='11/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    case "Dec": {
		        driver.findElement(By.xpath("//td[@data-day='12/" + shipFDay + "/" + shipFYear + "']")).click();
		        System.out.println("Date Selected");
		        break;
		    }
		    default: {
		        System.out.println("Please enter the date in the standard format like DD-MMM-yyyy");
		     break;
		    }
		    }
		WebElement m = driver.findElement(By.xpath("//select[@name='country_ids[]']"));
		Select sel = new Select(m);
		sel.selectByValue("20");
		driver.findElement(By.xpath(".//*[@id='spree/order_search']/div[5]/button")).click();

		
		
	}
}