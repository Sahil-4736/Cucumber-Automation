package CheckboxesandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownwithSelectTag {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
Select countrydropdown=new Select(dropdown);
//countrydropdown.selectByVisibleText("Finland");
countrydropdown.selectByValue("7");
List<WebElement> countryno=countrydropdown.getOptions();
System.out.println(countryno.size());
for(int i=0;i<countryno.size();i++)
{
	System.out.println(countryno.get(i).getText());
}
/*for(WebElement co:countryno);
{
	System.out.println(co.getText());
}*/
	}

}
