import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
public class Mouse_movement_example2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homeshop18.com/");
		
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Thread.sleep(3000L);
		
		WebElement menu = driver.findElement(By.xpath("//a[@href='http://www.homeshop18.com/s/mobileitlink/?it_category=MN&it_action=MA-HTLKAA&it_label=MN-HTLKAA-170302105643-JQ-MA-160615-AK-AK-AD-MP_MobileAndTablets&it_value=0']"));
		
		Thread.sleep(3000L);
		
	    WebElement submenu = driver.findElement(By.xpath("//a[@href='http://www.homeshop18.com/micromax/categoryid:14569/search:micromax/inStock:%28%22true%22%29/sort:New+Arrivals/?it_category=MN&it_action=MA-MMAA01&it_label=MN-MMAA01-180904124343-VI-MA-150416-AM-AR-ML-ScSpice_Spice&it_value=0']"));
	    Thread.sleep(3000L);
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(3000L);
	    action.moveToElement(menu).perform();
	    submenu.click();
	   
		
	}

}
