package alertsandpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithInputbox {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("HelloSahil");
			
		alertwindow.accept();
		//alertwindow.dismiss();
		//validation
		
				String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
				String exp_text="You entered: HelloSahil";
				
				System.out.println(act_text);
				System.out.println(exp_text);
				
				if(act_text.equals(exp_text))
				{
					System.out.println("testcase passed");
				}
				else
				{
					System.out.println("testcase failed");
				}
	}

}
