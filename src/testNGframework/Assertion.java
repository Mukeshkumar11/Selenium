package testNGframework;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;
	
	@Test
	public void a_zeroapp() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Selenium_workspace\\SeleniumWorkPractice\\Driver\\chromedriver.exe");
		 	driver = new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
	}
	
	@Test
	public void b_assertsequals() {
		String element1 = driver.findElement(By.xpath("//strong[text()='Online Banking']")).getText();
		System.out.println(element1);
		Assert.assertEquals(element1, "ONLINE_BANKING");
		System.out.println("Asserts Equals Pass");
		
	}
	
	@Test
	public void c_assertsnotequals() {
		String element1 = driver.findElement(By.xpath("//strong[text()='Online Banking']")).getText();
		System.out.println(element1);
		Assert.assertNotEquals(element1, "ONLINE_BANKING");
		System.out.println("Asserts NotEquals Pass");
		
	}
	
	@Test
	public void d_assertstrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[text()='Online Banking']")).getText()));
		System.out.println("Asserts True Pass");
		
	}
	
	@Test
	public void e_assertsfalse() {
		String element1 = driver.findElement(By.xpath("//strong[text()='Online Banking']")).getText();
		System.out.println(element1);
		Assert.assertFalse("ONLINE_BANKING".equals(element1));
		System.out.println("Asserts False Pass");
		
	}
	
	@Test
	public void f_assertNotNull() {
		Object title = driver.getTitle();
		Assert.assertNotNull(title);
		System.out.println("Assert NotNull");
		
	}
	
	@Test
	public void g_assertNull() {
		Object title = null;
		Assert.assertNull(title);
		System.out.println("Assert Null");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
