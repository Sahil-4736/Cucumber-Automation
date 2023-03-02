package Amazonautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FeedbackReview {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7873683144");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sahil@4736");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		 WebElement account=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		    WebElement orderlist= driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"));
           Actions act=new Actions(driver);
           act.moveToElement(account).moveToElement(orderlist).click().perform();
		    driver.findElement(By.xpath("//span[@role='button']")).click();
		    driver.findElement(By.xpath("//a[normalize-space()='2022']")).click();
		    driver.findElement(By.xpath("//body/div/div[@role='main']/div/div/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/a[1]")).click();
		    driver.findElement(By.xpath("//img[@alt='select to rate item four star.']")).click();
		    driver.findElement(By.xpath("//input[@placeholder=\"What's most important to know?\"]")).sendKeys("Good fit");
		   driver.findElement(By.xpath("//textarea[@placeholder='What did you like or dislike? What did you use this product for?']")).sendKeys("Good Product");
           driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}

}
