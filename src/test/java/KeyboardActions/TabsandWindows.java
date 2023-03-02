package KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
			
			driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
			//driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW
			driver.get("https://www.flipkart.com/");
	}

}
