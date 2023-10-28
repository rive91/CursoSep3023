package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC04_LoginJson {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC04() {
		String username = WrapClass.getJsonValue("tc04", "username");
		String pwd = WrapClass.getJsonValue("tc04", "password");

		loginPage.login(username,pwd);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrenshot(driver, "TC04_LoginJson");
		driver.quit();
	}
}
