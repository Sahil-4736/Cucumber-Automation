package idsassignment;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("popular cloud solution");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
    WebElement firstlink=driver.findElement(By.xpath("//*[@id=\"tads\"]/div[1]/div/div/div/div[1]/a/div[1]/span"));
     Actions action= new Actions(driver);
     action.keyDown(Keys.CONTROL).moveToElement(firstlink).click().perform();
     ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(tabs.get(1));
	}

}
