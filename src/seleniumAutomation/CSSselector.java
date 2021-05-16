package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://zero.webappsecurity.com/");
		
		//driver.findElement(By.className("signin btn btn-info")).click();
		driver.findElement(By.cssSelector(".signin btn btn-info")).click();
		//driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.cssSelector("#user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
