package testNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLab {
	WebDriver driver;
	@BeforeSuite
	public void a_openBrowser() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
	}
	
//	@Test
//	public void b_Login() throws InterruptedException {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//	}
//	
//	@Test
//	public void c_Logout() throws InterruptedException {
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//	}
//	
	@Test
	public void b_agilsys() {
		driver.findElement(By.name("q")).sendKeys("agilysys"+Keys.ENTER);

	}
	
	@Test(dependsOnMethods = "b_agilsys")
	public void c_agilsysFirstlink() {
		driver.findElement(By.xpath("//h3[text()='Agilysys: Hospitality Software & Solutions']")).click();

	}
	
	@AfterSuite
	public void close() {
		driver.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
