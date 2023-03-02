package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
System.out.println("The title of the Page is  "+ driver.getTitle());
System.out.println("The Current URL is   "+ driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
System.out.println(driver.getWindowHandle());
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
System.out.println(driver.getWindowHandles());
	}

}
