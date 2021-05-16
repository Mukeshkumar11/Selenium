package seleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(DoubleClick).build().perform();
		
		Alert aler = driver.switchTo().alert();
		String text = aler.getText();
		System.out.println(text);
		aler.accept();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
