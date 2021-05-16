package testNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
	WebDriver driver;
	@Test
	public void a_openBrowser() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test
	public void b_roundTrip() {
		WebElement roundtrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundtrip.click();
		System.out.println("Roundtrip Radio "+roundtrip.isEnabled());
		
	}
	
	@Test
	public void c_checkBox() {
		WebElement checkBox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		checkBox.click();
		System.out.println("CheckBox "+ checkBox.isSelected());
	}
	
	@Test
	public void d_text() {
		WebElement text = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		System.out.println("Login Button "+text.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
