package dd_testCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_Core.TestCore;
import dd_utility.CheckForExecutable;

public class Logintest extends TestCore {
	
	@BeforeTest
	public void skip() {
		
		if(!CheckForExecutable.isExecutable("LoginTest",2)) {
			
			throw new SkipException("This test case can't be executes because runmode is NO");
		}
	}
	@DataProvider
	 public Object[][] loginData() {
		 
		 return reader.excelReader("sumit2");
		 //return data;
	 }
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider="loginData")
	public void Login(String username, String password,String message) throws Throwable {

		driver.findElement(By.xpath(object.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(object.getProperty("password"))).sendKeys(password);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonlogin"))));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonmessage"))));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonpandey"))));
		driver.findElement(By.xpath(object.getProperty("clickontype"))).sendKeys(message);
		driver.findElement(By.xpath(object.getProperty("clickonsend"))).click();
		
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		String date1= dateFormat.format(date);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='_5wd9 direction_ltr clearfix'][@data-tooltip-content='"+ date1+ "']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).pause(2000L).perform();
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@data-tooltip-content='More'][@data-hover='tooltip']")));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='_hw5'][@href='#']")));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='_2z1w  layerCancel _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")));    
		CheckForExecutable.captureScreenshot();
		}

}
