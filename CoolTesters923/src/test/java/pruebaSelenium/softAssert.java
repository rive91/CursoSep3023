package pruebaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void f() {
	  
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
			
	String actualTitle = driver.getTitle();
	String expectedTitle = "Swag Labs";
	String badTitle = "Swag Store";
	
	softAssert.assertEquals(actualTitle, badTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
  
	softAssert.assertAll();

	  
  }
}
