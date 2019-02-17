import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RoughWork {
	
	public static void gmail(String username, String password, String to, String location) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\":il\"]/div/div")));
		
	}

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://talkwithstranger.com/");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println("parent window "+parent);
		Set<String> allwin = driver.getWindowHandles();
		for(String a:allwin) {
			System.out.println("xyz  "+a);
			if(!parent.equalsIgnoreCase(a)) {
				driver.switchTo().window(a);
				driver.findElement(By.xpath("//*[@id=\"IL_SR_X3\"]")).click();
			}
		}*/
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sk4641230@gmail.com");
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("**********");
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")));

		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3'][@role='button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='vO'][@name='to']")).sendKeys("1509531052@coet.in");
		driver.findElement(By.xpath("//*[@id=\":o1\"]")).sendKeys("ijhitjhtjitj");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).sendKeys("C:\\Users\\Sumit\\Desktop\\flowvhartxvdfv.png");
		
		
	}

}
