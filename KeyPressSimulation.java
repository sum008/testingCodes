import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPressSimulation {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www2.gogoanime.xyz/anime-list.html");
	  /*  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sk4641230@gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Keys.ENTER);//Simulating Click function using Enter.
		*/
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/header/section/div[2]/a/img")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/header/section/div[2]/a/img")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000L);
		//driver.findElement(By.xpath("//*[@id='footer-list']/li[4]/a")).click();
		//Thread.sleep(10000L);
		//driver.findElement(By.xpath(".//*[@id='material-bar-custom-product-name']/a")).sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(10000L);
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/header/section/div[2]/a/img")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/header/section/div[2]/a/img")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/section/section[1]/div/div[3]/ul/li[1]/a")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/section/section[1]/div[1]/div[2]/div[1]/h1")).sendKeys(Keys.PAGE_DOWN);
		
		driver.findElement(By.xpath("//*[@id='wrapper_bg']/section/section[1]/div[1]/div[2]/div[1]/h1")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id='episode_related']/li[13]/a")).click();
		
	}

}
