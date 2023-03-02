package alertsandpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authinticatedpopup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//validation
String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}
		}
	}


