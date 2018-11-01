import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99TestProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		
		WebElement element = driver.findElement(By.name("uid"));
		element.sendKeys("mngr1336");
		
		element = driver.findElement(By.name("password"));
		element.sendKeys("google123");
		
		element = driver.findElement(By.name("btnLogin"));
		element.click();

	}

}
