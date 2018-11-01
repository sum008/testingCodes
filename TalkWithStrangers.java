import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TalkWithStrangers {    //CANT BE TESTED DUE TO CAPTCHA
	
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
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
			
			Thread.sleep(40000);
			driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[1]/div/div[1]/article/div[1]/div[1]/div/input")).sendKeys("M");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"talk\"]")).click();
			
			Thread.sleep(2000);
			
			String name = driver.findElement(By.xpath("//*[@id=\"partner-name\"]")).getText().toString();
			
			String s[];
			s = name.split(" ");
			
			for(int i=0;i<s.length;i++) {
				
				if(s[i]== "male"||s[i]=="Male" || s[i]== "man" || s[i]== "Man") {
					
					driver.findElement(By.xpath("//*[@id=\"chatStartStopButton\"]")).click();
				}
				else if(s[i]== "female"||s[i]=="Female" || s[i]== "f" || s[i]== "F") {
					
					driver.findElement(By.xpath("//*[@id=\"chatMessageInput\"]")).sendKeys("hi");
				}
				
			}
			
			Thread.sleep(2000);
			
			if(isElementPresent("//*[@id=\"chatStartStopButton\"]")==true) {
				
				driver.findElement(By.xpath("//*[@id=\"chatStartStopButton\"]")).click();
			}
			else driver.findElement(By.xpath("//*[@id=\\\"chatMessageInput\\\"]")).sendKeys("hi");

			

			
			
	}

}
