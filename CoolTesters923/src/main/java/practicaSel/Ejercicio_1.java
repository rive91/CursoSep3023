package practicaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Obtener objetos/webelemts de la pagina web
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-test = 'login-button']"));
		
		//Login
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(1000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(500);
		

		//Agregar al carrito de compras el primer elemento
		WebElement firstItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		firstItem.click();
		
		//Click en carrito de compras
		WebElement shopCart = driver.findElement(By.className("shopping_cart_link"));
		shopCart.click();

		//Click en Checkout
		WebElement chkBtn = driver.findElement(By.id("checkout"));
		chkBtn.click();
		
		//Fill your information page
		WebElement firstNameTxt = driver.findElement(By.id("first-name"));
		WebElement lastNameTxt = driver.findElement(By.id("last-name"));
		WebElement zipcodeTxt = driver.findElement(By.id("postal-code"));
		WebElement continueBtn = driver.findElement(By.id("continue"));
		
		firstNameTxt.sendKeys("Marcial");
		lastNameTxt.sendKeys("Rivera");
		zipcodeTxt.sendKeys("90210");
		continueBtn.click();

		//Click en Finish
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		
		String succesMej = driver.findElement(By.className("complete-header")).getText();
		System.out.println("El mensaje es: " + succesMej);
		Thread.sleep(500);

		driver.quit();

	}

}
