package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Mail { 
	public static void sendMail(String from, String password, String to, String path) throws Throwable{
		
		Robot r = new Robot();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(from);
		driver.findElement(By.xpath("//div[@role='button'][@id='identifierNext']")).click();
		//js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("//div[@role='button'][@id='passwordNext']")).click();
		//js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")));

		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3'][@role='button']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='vO'][@name='to']")).sendKeys(to);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("ijhitjhtjitj");
		driver.findElement(By.xpath("//div[@id=':pi']")).click();
		Thread.sleep(2000);
		StringSelection s = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		while(!driver.findElement(By.xpath("//div[@class='vI']")).isDisplayed()){
			
		}
		driver.findElement(By.xpath("//div[@id=':nq']")).click();
		System.out.println("Done!");

	}
	public static void main(String[] args) throws Throwable {
		
		sendMail("sk4641230@gmail.com", "#############", "1509531052@coet.in" , "C:\\Users\\Sumit\\Desktop\\back.txt");
		/*Robot r = new Robot();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(from);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")));

		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3'][@role='button']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='vO'][@name='to']")).sendKeys(to);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("ijhitjhtjitj");
		driver.findElement(By.xpath("//div[@id=':pi']")).click();
		Thread.sleep(2000);
		StringSelection s = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@id=':nq']")).click();
		System.out.println("Done!");
*/		//driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).sendKeys("C:\\Users\\Sumit\\Desktop\\flowvhartxvdfv.png");
		
		

	}

}
