import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radioList =driver.findElements(By.name("lang"));
		
		for(int i =0;i<=radioList.size();i++) {
			
			String id = radioList.get(i).getAttribute("id");
			
			System.out.println("id is : "+ id);
			
			if(id.contains("ruby")) {
				
				radioList.get(i).click();
				break;
			}
		}
	}

}
