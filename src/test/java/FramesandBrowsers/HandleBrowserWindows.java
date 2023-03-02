package FramesandBrowsers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> WindowIDs=driver.getWindowHandles();
		/*List<String> Windowlists=new ArrayList(WindowIDs);
		String ParentWindowID=Windowlists.get(0);
		String ChildWindowID=Windowlists.get(1);
		driver.switchTo().window(ChildWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		driver.switchTo().window(ParentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");*/
		
		//Approach2

		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if( title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.close();
			}
		}*/
		//Approach3
		for(String winid:WindowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			
			if( title.equals("x") || title.equals("y") || title.equals("z"))
			{
				driver.close();
			}
		}
		
		

	}

}
