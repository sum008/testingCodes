package dd_testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@Test(dataProvider="loginData")
	public void Login(String username, String password,String message) throws Throwable {
		
		//driver.findElement(By.xpath(object.getProperty("loginbutton"))).click();
		driver.findElement(By.xpath(object.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(object.getProperty("password"))).sendKeys(password);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonlogin"))));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonmessage"))));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickonpandey"))));
		//js.executeAsyncScript("arguments[0].click();", driver.findElement(By.xpath(object.getProperty("clickontype"))).sendKeys(message));
		//driver.findElement(By.xpath(object.getProperty("clickontype"))).sendKeys(message);
		//driver.findElement(By.xpath(object.getProperty("clickonsend"))).click();
		//CheckForExecutable.captureScreenshot();
		//driver.findElement(By.xpath(object.getProperty("clickonlogin"))).click();
		js.executeScript("arguments[0].value='Avinash Mishra';", driver.findElement(By.xpath(object.getProperty("clickontype"))));//showing error
	}

}
