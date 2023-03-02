package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		
		WebElement txtmailbox= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		txtmailbox.clear();
		txtmailbox.sendKeys("admin@yourstore.com");
		
		WebElement psswdbox=driver.findElement(By.name("Password"));
		psswdbox.clear();
		psswdbox.sendKeys("admin");

driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
Thread.sleep(5000);
		/*String actl_title=driver.getTitle();
		String expt_title="nopCommerce";
		if(actl_title.equals(expt_title))
		{
			System.out.println("Test Case is Paased");
		}
		else
		{
			System.out.println("Test Case is Failed");
	
		}*/
		
	String actl_label=((WebElement) driver.findElements(By.xpath("/html/body/div[3]/div[1]/div[1]/h1"))).getText();
	String expt_label="Dashboard";
	if(actl_label.equals(expt_label))
	{
		System.out.println("Testcase is Passed");
	}
	else {
		
		System.out.println("Testcase is Failed");
	}
	}
	}
	
	
	


