package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practisedropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("CHE");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("main.rh_content section.head-banner div.banner-wrapper div.clearfix:nth-child(3) div.clearfix.search-wrap div.fl.search-box.clearfix:nth-child(1) div:nth-child(2) ul.autoFill:nth-child(2) > li.selected:nth-child(1)"));
		List<WebElement> options = driver.findElements(By.cssSelector("main.rh_content section.head-banner div.banner-wrapper div.clearfix:nth-child(3) div.clearfix.search-wrap div.fl.search-box.clearfix:nth-child(1) div:nth-child(2) ul.autoFill:nth-child(2) > li.selected:nth-child(1)"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("CHENNAI")) {
				option.click();
				break;

			}
		}

		// driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).click();
		// driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")).sendKeys("GUWAHATI");
		/*
		 * driver.findElement(By.xpath("//li[contains(id(),'123')]")).sendKeys(Keys.
		 * ARROW_DOWN);
		 * driver.findElement(By.xpath("//li[contains(id(),'123')]")).sendKeys(Keys.
		 * ENTER);
		 */
	}

	{

	}

}
