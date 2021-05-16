package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\BaseProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nunzioweb.com/");
		int iframecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframecount);
		
		driver.switchTo().frame("oddcouple");
		String text = driver.findElement(By.xpath("//div[contains(text(),'A television')]")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
