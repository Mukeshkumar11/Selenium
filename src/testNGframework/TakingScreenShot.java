package testNGframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShot {
	
	WebDriver driver;
	@Test
	public void a_pageload() {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("email")).sendKeys("mukesh12@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("mukesh");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	@Test
	private void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scoure = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Mukeshkumar\\Desktop\\ScreenShot");
		FileUtils.copyFile(scoure, desc);

	}
	
	
	

}
