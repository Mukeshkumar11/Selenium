package seleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions ac = new Actions(driver);
		ac.contextClick(rightclick).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert aler = driver.switchTo().alert();
		String text = aler.getText();
		System.out.println(text);
		aler.accept();

	}

}
