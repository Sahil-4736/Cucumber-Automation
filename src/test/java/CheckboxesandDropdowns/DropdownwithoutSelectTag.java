package CheckboxesandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelectTag {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		System.out.println(options.size());
/*for(int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
	
}*/
		for(int i=0;i<options.size();i++)
		{
			String option=options.get(i).getText();
		if(options.get(i).getText().equals("Java")||options.equals("Python"));
		{
			options.get(i).click();
			
			
		}
			
		}
	}

}
