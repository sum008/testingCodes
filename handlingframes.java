import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframes {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();  
			driver.get("url");
			
			//sometimes frame that opens when entering into site is in new window and the closing button is in main window.
			Set<String> winid = driver.getWindowHandles();
			Iterator<String> iterate = winid.iterator();
			String mainwin = iterate.next();
			
			driver.switchTo().frame("frame id");
			driver.findElement(By.xpath("xpath of frame")).sendKeys("sdfs");
			
			driver.switchTo().window(mainwin);//switching back to main window as close button is in main window
			driver.findElement(By.xpath("xpath of cross button")).click();

	}

}
