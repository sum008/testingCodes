import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String xpath) {
		
		int size = driver.findElements(By.xpath(xpath)).size();
		if(size == 0) {
			
			return false;
		}else {
			
			return true;
		}
	}

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();  
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_checkbox_disabled2");
			
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			
			driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));//switched main window to frame
			
			System.out.println(isElementPresent("//*[@id=\"myCheck\"]"));
			
			System.out.println("selected :" +driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isSelected());
			
			System.out.println("displayed : " + driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isDisplayed());
			
			System.out.println("enabled :" +driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isEnabled());
			
			driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).click();//clicked on checkbox
			
			System.out.println("selected :" +driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isSelected());
			
			System.out.println("displayed :" +driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isDisplayed());
			
			System.out.println("enabled :" +driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).isEnabled());
			
			System.out.println(isElementPresent("//*[@id=\"myCheck\"]"));
			
			driver.switchTo().defaultContent();
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"framesize\"]")).getText()); 
			
			System.out.println(isElementPresent("//*[@id=\"myCheck\"]"));

	}

}
