import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class testListeners {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		WebDriver web = new ChromeDriver(); 
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web);
		
		weblisteners listener = new weblisteners();
		
		driver.register(listener);
		
		driver.navigate().to("http://google.com");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[1]")).click();
		Thread.sleep(1000L);
		driver.navigate().back();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[2]")).click();

	}

}
