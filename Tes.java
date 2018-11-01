import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes {
	

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		
		driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul//li[@class]//a[@href='#']"));

		for(WebElement w : list) {
			
			String city = w.getAttribute("text");
			
			System.out.println("city is :" + city);
			
		}
		
		for(int i=0;i<list.size();i++) {
			
			String city = list.get(i).getAttribute("text");
			
			System.out.println("city is :" + city);
			
			if(city.contains("Gorakhpur")) {
				
				list.get(i).click();
				break;
			}
		}

		/*driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();

		try {
		for(int i=1;i<=13;i++) {
			
			for(int j=1;j<=4;j++) {
		System.out.println(driver.findElement(By.xpath("//ul["+j+"]//li[@class]["+i+"]//a[@href='#']")).getText());
		}
			System.out.println("---------------------------------------------------------------------------------------");
		}
		}catch(Throwable t) {
			System.out.println("there is no fourth element in last row");
		}
		
		System.out.println("##################################################################################################################################################");
		
		try {
			for(int i=1;i<=13;i++) {
				
				for(int j=1;j<=4;j++) {
			if(driver.findElement(By.xpath("//ul["+j+"]//li[@class]["+i+"]//a[@href='#']")).getText().equals("Kishangarh (KQH)")){
				
				driver.findElement(By.xpath("//ul["+j+"]//li[@class]["+i+"]//a[@href='#']")).click();
			}
			}
			
			}
		}catch(Throwable t) {
			
			System.out.println("there is no fourth element in last row");
			
		} */
		
		//#############################################################################################################################################################
		
		/*	driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		WebElement we = driver.findElement(By.xpath("//div[@class='locationFilter autocomplete_to']")); //includes whole table at once
		
		js.executeScript("arguments[0].scrollIntoView(true);", we);//scrolls into whole table starting from 0
			
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i).getText());
		}
		for(int i=0;i<list1.size();i++) {
			
			if(list1.get(i).getText().contains("Kolkata, India")) {
				
				list1.get(i).click();
			}
			
		} 
		Thread.sleep(5000L);
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement w : list1) {
			
			String s = w.getAttribute("aria-label");//Not work with all browsers. aria-label is giving the label to current element
			
			System.out.println(s);
			if(s.contains("Kolkata, India")) {
				
				w.click();
			}
		}*/

}

}
