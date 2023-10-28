package commonClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


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

	public static boolean verifElementDisplayed(WebElement webelementUI) {
		return webelementUI.isDisplayed();
	}
	
	public static void takeScrenshot(WebDriver webdriver, String testCaseName) {
		//Tomar el screenshot de la pagina
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//La ruta donde se va a guardar el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		//Creamos el fodler usando la ruta especificada de la variable screenshotPath
		FileHandler.createDir(new File(screenshotPath));
			try {
				FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static String getJsonValue(String jsfileObj, String jsonKey) {
		
		try {
			InputStream inputStream = new FileInputStream(GlobalVariables.TEST_DATA + jsfileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			String jsonValue = (String) jsonObject.getJSONObject(jsfileObj).getString(jsonKey);
			return jsonValue;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getCellData(String excelName, int row, int column) {
		//leer el archivo
		FileInputStream fis;
		try {
			fis = new FileInputStream(GlobalVariables.TEST_DATA + excelName + ".xlsx");
			//Construir un objeto de excel
			Workbook wb = new XSSFWorkbook(fis);//leyendo el archivo de excel
			Sheet sheet = wb.getSheetAt(0); //Leeyendo hoja 0 del archivo
			Row rw = sheet.getRow(row);//Indicando la fila
			Cell cell = rw.getCell(column);//Indicando la columna de la fila
			
			String value = cell.getStringCellValue();
			return value;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
