package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class InventoryPage {
	
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//LoginPage WebElements
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addCartBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeCartBtn;
	
	public boolean addToCartAnVerifyRemoveBtn() {
		WrapClass.click(addCartBtn);
		return WrapClass.verifElementDisplayed(removeCartBtn);
	}
}
