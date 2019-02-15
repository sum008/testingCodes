import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TalkWithStrangers {    
	static boolean a = true;
	public static void function() throws Throwable {
		Thread.sleep(1000);
		String name = driver.findElement(By.xpath("//*[@id=\"partner-name\"]")).getText().toString();
	    
		Thread.sleep(3000);
		if(isElementPresent("//input[@value='NEW']")==false) { ////*[@id="chatStartStopButton"]  
			//System.out.println("qqqqqq");
	    if(name.toLowerCase().contains("female")||name.toLowerCase().contains("f")
	    	||name.toLowerCase().contains("stranger")||name.toLowerCase().contains("someone")) {
	    	//System.out.println("uuuuuu");
	    	driver.findElement(By.xpath("//*[@id=\"chatMessageInput\"]")).sendKeys("hi");
	    	driver.findElement(By.xpath("//*[@id=\"chatSendButton\"]")).click();
	    	a=false;
	    	
		}else {
			name = driver.findElement(By.xpath("//b[@id='partner-name']")).getText().toString();
		    driver.findElement(By.xpath("//*[@id=\"chatStartStopButton\"]")).click();
		}
		}else
		     driver.findElement(By.xpath("//*[@id=\"chatStartStopButton\"]")).click();
    }
	public static WebDriver driver;
	public static boolean isElementPresent(String xpath) {
		
		try {
		driver.findElement(By.xpath(xpath));
		return true;
		}catch(Throwable t) {
			
			return false;
		}
	}

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();  
			driver.get("https://talkwithstranger.com/");
			Actions action = new Actions(driver);
			//Thread.sleep(2000);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[1]/div/div[1]/article/div[1]/div[1]/div/input"));
			Thread.sleep(1000);
			action.doubleClick(element).build().perform();
			element.sendKeys("male");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"talk\"]")).click();
			
			while(a==true) {
				function();
			}
}
}
