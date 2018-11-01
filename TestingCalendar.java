


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingCalendar {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.tripadvisor.in/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[1]/div/span/input")).click();
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[1]/div/span/input")).sendKeys("five star");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@id=\"taplc_trip_search_home_default_0\"]/div[2]/div[2]/div/span[1]")).click();
		Thread.sleep(1000L);
		
		String date = "12 Nov-Nov 2018";
		String daychkin = "28";
		String splitter[] = date.split("-");
		String day_monthchkin = splitter[0];
		String month_yearchkin = splitter[1];
		
		String Date = "12 Nov-Nov 2018";
		String daychkout = "25";
		String Splitter[] = Date.split("-");
		String day_monthchkout = Splitter[0];
		String month_yearchkout = Splitter[1];
	 
		daymonthyearchkin(daychkin,day_monthchkin,month_yearchkin);
		
		daymonthyearchkout(daychkout,day_monthchkout,month_yearchkout);
		
		roomSelect();
		
}
	
public static void daymonthyearchkin(String daychkin,String day_monthchkin,String month_yearchkin) throws InterruptedException  {
		
		
	    driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[2]/div/span[1]")).click();
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day']"));
		//System.out.println(element.size());
		
		Timeout.seconds(1000L);
		
		List<WebElement> monthYear = driver.findElements(By.xpath("//span[@class='rsdc-month-title']"));
		
		System.out.println(monthYear.size());
		 
		for(int j=0;j<=0 ;j++ ) {
			
			System.out.println(monthYear.get(j).getText());
			
			if(monthYear.get(j).getText().equals(month_yearchkin)) {
				
				System.out.println("month and year are checking : " + month_yearchkin);
			
			       
			
			for(int i=1;i<=element.size();i++) {
			
			
		  	           System.out.println(driver.findElement(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day'][" + i + "] ")).getText());
			
			
			            if(element.get(i).getText().equals(daychkin) ) {
				
				           driver.findElement(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day'][" + (i+1) + "] ")).click();
				           return;
			           }
		
		           }
		     
		     }else {
		    	 
		    	 driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[2]/div[1]")).click();
		    	 System.out.println("We are in else loop");
			 	Thread.sleep(1000L);
			 	daymonthyearchkin(daychkin,day_monthchkin,month_yearchkin);
				return;
			      
		     }
	     }
		    	 
      }	



public static void daymonthyearchkout(String daychkout,String day_monthchkout,String month_yearchkout) throws InterruptedException  {
	
	
    //driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[2]/div/span[1]")).click();
	List<WebElement> element = driver.findElements(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day']"));
	//System.out.println(element.size());
	
	Timeout.seconds(1000L);
	
	List<WebElement> monthYear = driver.findElements(By.xpath("//span[@class='rsdc-month-title']"));
	 
	for(int j=0;j<=monthYear.size() ;j++ ) {
		
		System.out.println(monthYear.get(j).getText());
		
		if(monthYear.get(j).getText().equals(month_yearchkout)) {
			
			System.out.println("month and year are checking : " + month_yearchkout);
		
		       
		
		for(int i=1;i<=element.size();i++) {
		
		
	  	           System.out.println(driver.findElement(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day'][" + i + "] ")).getText());
		
		
		            if(element.get(i).getText().equals(daychkout) ) {
			
			           driver.findElement(By.xpath("//span[@class='rsdc-month'][1]/span[@class='rsdc-cell rsdc-day'][" + (i+1) + "] ")).click();
			           return;
		           }
	
	           }
	     
	     }else {
	    	 
	    	 driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[2]/div[1]")).click();
		 	Thread.sleep(1000L);
		 	daymonthyearchkout(daychkout,day_monthchkout,month_yearchkout);
			return;
		      
	     }
     }
	    	 
  }

public static void roomSelect() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[3]/div/div/span[2]/span[2]")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[1]/div/span[1]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[1]/div/span[1]/span[2]")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[3]/div/span[1]/span[2]")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[4]/span/span/span[2]/span[2]")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[4]/span/span/div/span/ul[2]/li[10]")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[5]/span")).click();
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//*[@id='SUBMIT_HOTELS']")).click();
}
		
}
		



