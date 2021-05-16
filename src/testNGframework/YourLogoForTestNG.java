package testNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YourLogoForTestNG {
		
		WebDriver driver;
		@Test (priority=1)
		public void pageload() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		}
		
		//Registration
		@Test (priority=2)
		public void registration() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("email_create")).sendKeys("mukesh12@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		}
		
		//Registration Form Filling
		
		//Personal Information
		@Test (priority=3)
		public void personInformation() throws InterruptedException {
		WebElement radio1 = driver.findElement(By.id("id_gender2"));
		Thread.sleep(5000);
		radio1.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sujan");
		Thread.sleep(5000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		Thread.sleep(5000);
		driver.findElement(By.id("passwd")).sendKeys("mukesh");
		driver.findElement(By.id("days")).click();
		Thread.sleep(5000);
		Select days = new Select (driver.findElement(By.id("days")));
		days.selectByVisibleText("1  ");
		driver.findElement(By.id("days")).click();
		driver.findElement(By.id("months")).click();
		Thread.sleep(5000);
		Select months = new Select (driver.findElement(By.id("months")));
		months.selectByVisibleText("June ");
		driver.findElement(By.id("months")).click();
		driver.findElement(By.id("years")).click();
		Thread.sleep(5000);
		Select years = new Select (driver.findElement(By.id("years")));
		years.selectByVisibleText("1988  ");
		driver.findElement(By.id("years")).click();
		}
		
		//Address Information
		@Test (priority=4)
		public void information() {
		driver.findElement(By.id("firstname")).sendKeys("mukesh");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("company")).sendKeys("QSpiders");
		driver.findElement(By.id("address1")).sendKeys("Chromepet");
		driver.findElement(By.id("address2")).sendKeys("Chennai");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("id_state")).click();
		Select state = new Select (driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Florida");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("postcode")).sendKeys("32003");
		driver.findElement(By.id("other")).sendKeys("QA Testing Information");
		driver.findElement(By.id("phone_mobile")).sendKeys("8484848584");
		driver.findElement(By.id("alias")).sendKeys("Address-1");
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		}
		
		//Sign out
		@Test (priority=5)
		public void signout() {
		driver.findElement(By.linkText("Sign out")).click();
		}
		
		//Sign in
		@Test (priority=6)
		public void signin() {
		driver.findElement(By.id("email")).sendKeys("mukesh12@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("mukesh");
		driver.findElement(By.id("SubmitLogin")).click();
		}
		
	}

