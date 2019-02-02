package dd_Core;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import dd_utility.ExcelRead;

public class TestCore {
	
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelRead reader = null;	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public static void initializations() throws Throwable {
	if(driver==null) {
	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\config.properties");
		config.load(fis);
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\object.properties");
		object.load(fis);
		
		reader=new ExcelRead(System.getProperty("user.dir")+"\\src\\dd_properties\\testdata.xlsx");
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
		 driver.get(config.getProperty("site"));
			
	}
	}
	/*@AfterSuite
	public static void close() {
		driver.close();
	}*/
	

}
