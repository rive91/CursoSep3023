package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webelementUI) {
		webelementUI.click();
	}
	
	public static void sendKeys(WebElement webelementUI, String text) {
		webelementUI.sendKeys(text);
	}
	
	public static String getText(WebElement webelementUI) {
		return webelementUI.getText();
	}

}
