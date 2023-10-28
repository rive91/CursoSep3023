package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC01_Login {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC01() {
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.STANDAR_PASSWORD);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrenshot(driver, "TC01_Login");
		driver.quit();
	}
}
