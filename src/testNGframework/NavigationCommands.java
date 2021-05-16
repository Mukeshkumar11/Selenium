package testNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
	WebDriver driver;
	@Test
	public void a_openBrowser() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().to("http://zero.webappsecurity.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	
	}
}
