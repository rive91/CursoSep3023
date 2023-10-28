package practicaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
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
		
		//Metodos del explorador
		//Obtener titulo de la pagina
		String title = driver.getTitle();
		System.out.println("El titualo es: " + title);
		
		//Obtener URL
		String url = driver.getCurrentUrl();
		System.out.println("La URL es: " + url);

		
		//Metodos de navegacion
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		//Vericar elemento desplegado en la pagina
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(prodContainer) {
			System.out.println("El articulo esta desplegado");
		}
		
		//Obtener Text
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("El producto es: " + prodName);
		
		//DropDowns
		driver.manage().window().maximize(); //Maxizimar la ventana del navegador
		Select drpdwnProdSelect = new Select(driver.findElement(By.className("product_sort_container")));
		drpdwnProdSelect.selectByVisibleText("Price (low to high)");

		//Cerrar Navegador web
		//driver.close(); //Cierra la ventana/pestaña actual que el webdriver esta usando
		driver.quit(); //Cierrta todas las ventanas del browser que el webdriver
	}

} 
