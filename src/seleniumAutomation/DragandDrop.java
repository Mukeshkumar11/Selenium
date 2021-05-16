package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

		WebDriver driver;
		@Test
		public void a_BrowserLaunch(){
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		}
		
		@Test
		public void b_DragandDrop() {
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


