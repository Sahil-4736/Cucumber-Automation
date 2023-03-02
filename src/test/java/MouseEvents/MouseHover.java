package MouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		
		Actions act=new Actions(driver);
		
		//Mouse hover
		
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();// creating action then perform 
		act.moveToElement(desktops).moveToElement(mac).click().perform(); // directly performing action
		

	

	}

}
