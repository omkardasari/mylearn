package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(WebElement e:links)
		{
		    System.out.println(e.getText());
		}
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");  // orange hrm
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		driver.findElement(By.id("menu_maintenance_PurgeRecords")).click();
		driver.findElement(By.xpath("//a[@id='menu_maintenance_purgeCandidateData']")).click();
		driver.findElement(By.cssSelector("#confirm_password")).sendKeys("omkar");*/
		
		
	
		
		
		
		
		
		
		
		/*driver.findElement(By.id("src")).click();// red bus
		driver.findElement(By.id("src")).sendKeys("HYD");
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("CHENNAI");
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[5]")).click();
		driver.findElement(By.id("search_btn")).click();*/
		
		
		
		
		
		
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
