package CheckboxesandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tuesday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wednesday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"thursday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"friday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"saturday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();

	//List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and type='checkbox']"));
	//System.out.println(checkboxes.size());
	
	//for(int i=0;i<checkboxes.size();i++);
	//{
		
	//checkboxes.get(i).click();
	//}
	//for(WebElement cb:checkboxes);
	//{
		//cb.click();
	//}
	      
	
		
		
	
	
	}
}
