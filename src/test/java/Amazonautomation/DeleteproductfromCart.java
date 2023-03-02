package Amazonautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteproductfromCart {

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
		
		driver.findElement(By.id("nav-cart-count-container")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();

	}

}
