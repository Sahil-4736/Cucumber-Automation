package seleniumtesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("Input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("MacBook");
		
		driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("MacBook");
		
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
	}

}
