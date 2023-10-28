package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC05_LoginExcel {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setDriver();
	
	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC05() {
		String username = WrapClass.getCellData("tc05", 1, 0);
		String pwd = WrapClass.getCellData("tc05", 1, 1);

		loginPage.login(username,pwd);
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScrenshot(driver, "TC05_LoginExcel");
		driver.quit();
	}
}
