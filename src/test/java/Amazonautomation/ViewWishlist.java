package Amazonautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ViewWishlist {

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
		 WebElement    account=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		    WebElement wishlist= driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span"));


	 Actions act=new Actions(driver);

		    act.moveToElement(account).moveToElement(wishlist).click().perform();
		

	}

}
