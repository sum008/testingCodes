import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://freecrm.com");		
		/*driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("gogo");
		driver.findElement(By.xpath("//*[@id='sa_5004']/div")).click();
		driver.findElement(By.xpath("//*[@id='sb_form_go']")).click();
		driver.findElement(By.xpath("//*[@id='b_results']/li[1]/h2/a")).click(); */
		 Thread.sleep(12000L);
         driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("353535131");
		 
		 Thread.sleep(2000L);
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("4654644");
		 
	}

}
