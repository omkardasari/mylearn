package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practisedropdown3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("HYD");  //autosuggestive
		Thread.sleep(3000); // must give sleep to invoke element and select hyd 
        driver.findElement(By.cssSelector("#ui-id-3")).click();// give click instruction
		List<WebElement> options =driver.findElements(By.cssSelector("#ui-id-3"));
		

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("HYDERABAD")) {
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