package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.netflix.com/in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_b_amazontest_mkw_5bgcvGj1-dc&mrntrk=pcrid_75660303191630_slid__pgrid_1210562788151299_pgeo_90_x__ptid_kwd-75660529116296:loc-90/");
		System.out.println(driver.getCurrentUrl());
	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); 
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); 
		
		driver.navigate().refresh();  
		
		
	}

}
