package seleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium_workspace\\SeleniumPrograms\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	//ExplicitWait
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Sachin Tendulkar - Wikipedia']")));
		
		//FluientWait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h3[text()='Sachin Tendulkar - Wikipedia']")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
