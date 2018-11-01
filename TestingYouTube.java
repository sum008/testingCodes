import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingYouTube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=LTtR4foRsCw&pbjreload=10");
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//*[@id='movie_player']/div[25]/div[2]/div[1]/button")).click();
		
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//*[@id='movie_player']/div[25]/div[2]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id='movie_player']/div[25]/div[2]/div[1]/span/button")).click();
		
		Thread.sleep(2000L);
		
		WebElement slide = driver.findElement(By.xpath("//*[@id='movie_player']/div[25]/div[1]/div[1]/div[1]"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000L);
		
		action.dragAndDropBy(slide, 80, 0).build().perform();
		System.out.println("done");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='movie_player']/div[25]/div[2]/div[1]/span/button")).click();

	}

}
