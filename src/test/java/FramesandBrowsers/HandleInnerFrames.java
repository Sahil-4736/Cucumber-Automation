package FramesandBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrames {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ui.vision/demo/webtest/frames/");
	//frame1
	WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frm1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("14656554");
	driver.switchTo().defaultContent();
	//frame3
	WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frm3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("46588645");
	driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
	driver.switchTo().defaultContent();
	
	
	}

}
