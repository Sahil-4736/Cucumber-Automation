package idsassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("popular cloud solution");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"tads\"]/div[1]/div/div/div/div[1]/a/div[1]/span")).click();
        Thread.sleep(5000);
        Set<String> windowIDs=driver.getWindowHandles();
        List <String>windowidsList=new ArrayList(windowIDs);
		
		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(2);
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//*[@id=\\\"tads\\\"]/div[1]/div/div/div/div[1]/a/div[1]/span")).click();
		
		
	}

}
