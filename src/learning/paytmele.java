package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class paytmele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		WebElement dd =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));// static dropdown
		Select omm = new Select(dd);
		Thread.sleep(3000);
		omm.selectByValue("AED");
		
		WebElement dynamicdd = driver.findElement(By.xpath("(//a[@value='BLR'])"));
		Select justnamed = new Select(dynamicdd);
		Thread.sleep(1000);
		justnamed.selectByValue("BLR");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])")).click();
		Thread.sleep(2000);
		
		/*WebElement dom =driver.findElement(By.xpath("(//a[@value='BHO'][2])"));
		Select om = new Select(dom);
		om.selectByValue("BHO");*/
		
		
				
		
		
		
		 
		
		 
		
		
   

      
        
		

      
	}

}
