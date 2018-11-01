
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class Mouse_movement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web);
		
		weblisteners listeners = new weblisteners();
		
		driver.register(listeners);
		
		EventFiringMouse mouse  = new EventFiringMouse(driver,listeners);
		
		driver.get("https://www5.gogoanime.se/");
		
		Thread.sleep(3000L);
		
		Locatable item = (Locatable)driver.findElement(By.xpath("//*[@id=\"wrapper_bg\"]/header/section/div[3]/nav/ul/li[6]/a"));
		
		Coordinates cor  = item.getCoordinates();
		
		try {
			
		    mouse.mouseMove(cor);
			System.out.println("Mouse moved");
			
		}catch(Throwable t) {
			
			
		}
		
		
}

}
