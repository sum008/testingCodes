import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class action {

       public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys("Banglore");

		Thread.sleep(3000L);
	    driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys("Delhi");
	    
	    Thread.sleep(3000L);
	    //driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
		//Thread.sleep(2000L);
		//driver.findElement(By.xpath("//*[@id=\"dp1533445434813\"]/div/div[1]/table/tbody/tr[5]/td[1]")).click();
				
		
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//*[@id=\"chf_header\"]/div[1]/div/div[1]/p/a[1]")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//*[@id=\"chf_header\"]/div[1]/div/div[1]/p/a[1]")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//*[@id=\"chf_header\"]/div[1]/div/div[1]/p/a[1]")).sendKeys(Keys.PAGE_DOWN);
		
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"price_slider\"]/div"));
		  
		Actions action = new Actions(driver);
		
		Thread.sleep(1000L);
		
		action.dragAndDropBy(drag, -50, 0).perform();
		System.out.println("done");
		
		
	}

}



