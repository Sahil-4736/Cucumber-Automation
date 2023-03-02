package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); 
		//int rows=driver.findElements(By.tagName("tr")).size(); 
		System.out.println("Number of rows:"+ rows);
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); 
		System.out.println("Number of columns:"+ cols); 
		
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
	    System.out.println(value); 
	    
         System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value1+"\t"); 
			}
			System.out.println();
		}
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);
			}
			
		}
		
		
		
		
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price);
			
		}
		
		System.out.println("Total price of books:"+sum);

	}

}
