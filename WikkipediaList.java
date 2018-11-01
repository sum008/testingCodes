import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WikkipediaList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		
		//Select class requires Web Element in its argument
		Select sel = new Select(driver.findElement(By.id("searchLanguage")));
		sel.selectByValue("en");
		
		WebElement element = driver.findElement(By.id("searchInput"));
		element.sendKeys("speed");
	
		
   //   try {
	//		
		//	List<WebElement> option = sel.getOptions();
//			System.out.println(option.size());
	//	}catch(Exception e) {
//			System.out.println("failed");
	//	}
		
		System.out.println("--------Printing list of options-------------------------");
		//options(options of different language) will get stored into List 
        List<WebElement> option = sel.getOptions();
		System.out.println("size of list is : " + option.size());
      
        for(int i=0;i<option.size();i++) {
    	  
    	  System.out.println(option.get(i).getText());
      }
		
		System.out.println("--------Printing list of options by another method-------------------------");
		//Another method of getting list of options
		List<WebElement> options = driver.findElements(By.tagName("option"));
		 for(int i=0;i<options.size();i++) {
	    	  
	    	  System.out.println(options.get(i).getText());
	      }
		 
		 System.out.println("--------Printing all links-------------------------------");
		 
		// List<WebElement> link = driver.findElements(By.tagName("a"));
		 //for(int i=0;i<link.size();i++) {
	    	  
	    	//  System.out.println(link.get(i).getAttribute("href"));
	      //}
		 
		 
		 WebElement block = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]")); //This line will find a single element(block which stores 12 links)
		 List<WebElement> link  = block.findElements(By.tagName("a"));//This line will store all 16 links
		 System.out.println("Size is" + link.size());
		 for(int i=0;i<link.size();i++) {
	    	  
		    	  System.out.println(link.get(i).getText());
		    	     
		      }
		 
		element = driver.findElement(By.className("pure-button"));
		element.click();
		
		
		
		
		
		

	}

}
