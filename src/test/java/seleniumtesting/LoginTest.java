package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
String act_title=driver.getTitle();
String exp_title="OrangeHRM";
if(act_title.equals(exp_title)) 
{
	System.out.println("Testcase is Passed");
}
else
{
	System.out.println("Testcase is failed");
	}

driver.close();
	}
	}


