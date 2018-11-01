import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");	
		driver.findElement(By.xpath("//*[@id='fsl']/a[2]")).click();
		
        Thread.sleep(1000);		
		driver.navigate().back();
        Thread.sleep(1000);		
        driver.navigate().forward();

	}

}
