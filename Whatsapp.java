package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(60L,TimeUnit.SECONDS );
		String title = "lol";
		driver.findElement(By.xpath("//input[@type='text'][@title='Search or start new chat']")).sendKeys(title);
		driver.findElement(By.xpath("//span[@dir='auto'][@class='_1wjpf']")).click();
		
		int run=50;
		for(int i=0;i<run; i++){
			driver.findElement(By.xpath("//span[@data-icon='smiley']")).click();
			driver.findElement(By.xpath("//span[@data-icon='emoji-people']")).click();
			driver.findElement(By.xpath("//span[@class='b75 emojik wa'][@data-emoji-index='7']")).click();
			driver.findElement(By.xpath("//div[@class='_2S1VP copyable-text selectable-text']")).sendKeys("Some text");
			driver.findElement(By.xpath("//span[@class='b75 emojik wa'][@data-emoji-index='7']")).click();
			driver.findElement(By.xpath("//span[@data-icon='send']")).click();  ////span[@class='_3EFt_']
		}
		
		
		
	}

}
