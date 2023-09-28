package Validations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {

	@Test
	public void FirstValidationTest() {
		
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demowebshop.tricentis.com/");
	String expectedTitle = "Demo Web Shop";
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	/**
	 * Validating Title
	 */
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	String exepectedEmailId="obsqura24@gmail.com";
	
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys(exepectedEmailId);
	driver.findElement(By.id("Password")).sendKeys("mypassword");
	driver.findElement(By.className("login-button")).click();
	
	String actualEmailId=driver.findElement(By.xpath("(//*[@class='account'])[1]")).getText();
	
	Assert.assertEquals(actualEmailId, exepectedEmailId);
	
	String logoutText = driver.findElement(By.xpath("//*[@class='ico-logout']")).getText();
	
	System.out.println(logoutText);
	if(logoutText.contains("Log out")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.fail();
	}
	driver.quit();
	
	}
}
