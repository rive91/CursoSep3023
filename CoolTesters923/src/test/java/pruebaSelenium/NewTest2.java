package pruebaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
  }
}
