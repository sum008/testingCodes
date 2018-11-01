
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxes {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> button = driver.findElements(By.name("group1"));
		System.out.println(button.get(0).getAttribute("value"));//get attribute will return the attribute(i.e in case of value it will return Milk)
		System.out.println(button.get(0).getAttribute("checked"));//Here it will return null or true
		
		if(button.get(0).getAttribute("checked")==null){
			
			button.get(0).click();
			System.out.println("clicked");
		}else {
			
			button.get(1).click();
		}
		//button.get(2).click();
		System.out.println(button.get(0).getAttribute("checked"));
		System.out.println(button.get(1).getAttribute("checked"));
		
	}
		  
	}


