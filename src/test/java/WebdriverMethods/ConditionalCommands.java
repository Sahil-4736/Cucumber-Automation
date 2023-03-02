package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		//WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println("display status of logo:"+logo.isDisplayed());
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		//WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		//System.out.println(searchbox.isEnabled());
		//System.out.println(searchbox.isDisplayed());
		WebElement gdbox=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		System.out.println(gdbox.isSelected());
		gdbox.click();
		System.out.println(gdbox.isSelected());
		
		
        
	}

}
