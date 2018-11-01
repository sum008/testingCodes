import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupWindow {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.icicibank.com/");
		
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> iterate = winid.iterator();////Window id starts with 1 and iterator starts with 0 se we have to iterate to 1 to print id
		
		System.out.println("Fow main window------------->"+iterate.next());
		
		System.out.println("--------------------next window--------------------------------------------------------");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='nanorep-fw']/div/div/div[2]/div[2]/div[3]/div")).click();
		System.out.println("stpped");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/footer/div/a[1]")).click();
		Thread.sleep(2000);
		// winid = driver.getWindowHandles();
		 iterate = winid.iterator();
		 String popup = iterate.next();
		 driver.switchTo().window(popup);
		 System.out.println("For new window ----------> "+popup);
		 
		 System.out.println("--------------------next1 window-----------------------------------------------------");
		 driver.findElement(By.xpath("//*[@id='expand-all0']/div[3]/h2/i[2]")).click();
		 driver.findElement(By.linkText("Current Account")).click();
		// winid = driver.getWindowHandles();
		 iterate = winid.iterator();
		 String popup1 = iterate.next();
		 System.out.println("For new window ----------> "+popup1);
		 driver.switchTo().window(popup1);
		 
		 //System.out.println("--------------------closing-----------------------------------------------------");
		 Thread.sleep(2000);
		 driver.switchTo().window(popup1).close();
		 Thread.sleep(2000);
		 driver.switchTo().window(popup).close();
		 Thread.sleep(2000);
		driver.close();
		 
 
	}

}
