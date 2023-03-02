package Amazonautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileRecharge {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7873683144");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sahil@4736");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		 driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	        driver.findElement(By.xpath("//div[normalize-space()='Gift Cards & Mobile Recharges']")).click();
	        driver.findElement(By.xpath("//a[normalize-space()='Mobile Recharges']")).click();
	        driver.findElement(By.xpath("//a[@id='a-autoid-0-announce' and @title='Mobile Recharges']")).click();
	        driver.findElement(By.cssSelector("#mobileNumberTextInputId")).sendKeys("7550394839");
	        Thread.sleep(2000);
	        driver.findElement(By.partialLinkText("View pla")).click();
	        driver.findElement(By.xpath("//input[@value='Recommended Packs~118~NA~Same as your existing Pack~BDATL118~BILLDESK']")).click();
	        driver.findElement(By.xpath("//span[@id='payButtonText']")).click();
	        driver.findElement(By.xpath("//span[@class='a-color-base a-text-bold']")).click();

	}

}
