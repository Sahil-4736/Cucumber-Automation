package Amazonautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeOrder {

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
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("t-shirt for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-truncate-cut")).click();
		driver.findElement(By.className("ProductShowcase__title__SBCBw")).click();
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.xpath("//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']")).click();
		driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")).click();
		driver.findElement(By.cssSelector("input[aria-labelledby='submitOrderButtonId-announce']")).click();
		

	}

}
