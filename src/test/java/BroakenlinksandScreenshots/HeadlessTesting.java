package BroakenlinksandScreenshots;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		
				
				ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
				ChromeDriver driver=new ChromeDriver();

				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(3000);
					
				driver.findElement(By.name("username")).sendKeys("Admin");
					 
				driver.findElement(By.name("password")).sendKeys("admin123");
						
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				
				// validation
				
				String act_title=driver.getTitle();
				String exp_title="OrangeHRM";
				
				if(act_title.equals(exp_title))
				{
					System.out.println("Login test passed");
				}
				else
				{
					System.out.println("Login Test failed");
				}
				
			//7. close browser
				
				driver.quit();
				
				
	      

	}

}
