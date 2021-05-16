package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		
		WebElement applicance = driver.findElement(By.xpath("//div[text()='Appliances']"));
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
		ac.moveToElement(applicance).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
