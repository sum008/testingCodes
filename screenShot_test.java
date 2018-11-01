import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenShot_test {

	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\capturescreen.jpg"));
		
		//Screenshot if error occur
		
		try {
			
			WebElement element = driver.findElement(By.xpath("//*[@id='Email']"));
			element.sendKeys("sk4641230@gmail.com");
			
		}catch(Throwable t) {
			
			FileUtils.copyFile(scrFile, new File("D:\\capturescreen1.jpg"));
		}
	}
	
}
