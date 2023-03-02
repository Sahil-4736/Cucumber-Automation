package CheckboxesandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		Thread.sleep(3000);
List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Number of suggestions:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			
			if(text.equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
			
		}

	}

}
