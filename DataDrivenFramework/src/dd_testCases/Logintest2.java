package dd_testCases;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_Core.TestCore;
import dd_utility.CheckForExecutable;

public class Logintest2 extends TestCore {
	
	@BeforeTest
	public void skip() {
		
		if(!CheckForExecutable.isExecutable("NewLogin",3)) {
			
			throw new SkipException("This test case can't be executes because runmode is no");
		}
	}
	
	@DataProvider
	 public Object[][] loginData() {
		 
		 return reader.excelReader("sumit2");
		 //return data;
	 }
	
	@Test(dataProvider="loginData")
	public void Login(String username, String password) {
		
		driver.findElement(By.xpath(object.getProperty("loginbutton"))).click();
		driver.findElement(By.xpath(object.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(object.getProperty("password"))).sendKeys(password);
		//driver.findElement(By.xpath(object.getProperty("clickonlogin"))).click();
		
	}

}
