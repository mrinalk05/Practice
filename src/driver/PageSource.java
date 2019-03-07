package driver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PageSource {
	
	public static void main (String[]args){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.sandandsky.com");
		String html = driver.getPageSource();
		System.out.println(html);
		String fileSuffix = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
//		Document d = new Document();
//		try{
//			PdfWriter.getInstance(d, new FileOutputStream(new File("/Users/mrinalkumar/Documents/workspace/Practice/image/m.pdf")));
//			d.open();
//			Paragraph p = new Paragraph();
//			p.add(html);
//			d.add(p);
//			d.close();
//		}
		
		try{
			BufferedWriter bw =new BufferedWriter(new FileWriter("/Users/mrinalkumar/Documents/workspace/Practice/image/"+ fileSuffix+".txt"));
			bw.write(html);
		}
			
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		driver.quit();
	}

}
