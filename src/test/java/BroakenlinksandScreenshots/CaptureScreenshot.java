package BroakenlinksandScreenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			//Capture full page screenshot - selenium 3 & 4
			TakesScreenshot ts=driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\Users\\Sahil\\eclipse-workspace\\Automation\\seleniumproject\\Screenshots");
			FileUtils.copyFile(src,trg);
			 
			
			// capture screenshot of specific area from webpage -- selenium 4+
			
			/*WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
			
			File src=featuredproducts.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\Users\\Sahil\\eclipse-workspace\\Automation\\seleniumproject\\Screenshots");
			FileUtils.copyFile(src, trg);
			*/
			
			// capture screenshot of specific Web element -- selenium 4+
			
				//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			
				//File src=logo.getScreenshotAs(OutputType.FILE);
				//File trg=new File("C:\\Users\\Sahil\\eclipse-workspace\\Automation\\seleniumproject\\Screenshots");
				//FileUtils.copyFile(src, trg);
	}

}
