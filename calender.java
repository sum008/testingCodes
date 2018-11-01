import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender {  
	
	
	static int currentDay=0 ,
	           currentMonth = 0,
	           currentYear=0 ;
	
	static int targetDay=0 ,
			    targetMonth = 0,
			   targetYear=0 ;
	
	static int jumpMonthBy = 0;
	
	static boolean increment = true;
	
	

	public static void main(String[] args) throws InterruptedException {
		
		String dateToSet = "09/12/2018";
		
		GetCurrentDate();
		System.out.println("current date is : " + currentDay + " " + currentMonth + " " + currentYear);
		
		GetTargetDate(dateToSet);
		System.out.println("target date is : " + targetDay + " " + targetMonth + " " + targetYear);
		
		how_Many_Month_To_Jump();
		System.out.println(jumpMonthBy);
		System.out.println(increment);
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		
		
		Thread.sleep(3000L);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_default_0']/div[2]/div[2]/div/span[1]/span[2]/span")).click();
		Thread.sleep(2000L);
		//System.out.println(driver.findElement(By).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id='4187c555-423e-46ec-a730-97f5b4b7dd2f']/div[2]/a")).getText());
		
		for(int i=1;i<= jumpMonthBy;i++) {
			
			if(increment){
				
				driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[2]/div[1]")).click();
			}
		
			else {
				driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div[2]/div[2]")).click();

			}
			}
			
		}
		
	
	
	public static void GetCurrentDate() {
		
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
	}
	
	public static void GetTargetDate(String date) {
		
		int firstIndex = date.indexOf("/");
		int lastIndex = date.lastIndexOf("/");
		
		String day = date.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);
		
		String month = date.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		String year = date.substring(lastIndex+1, date.length());
		targetYear = Integer.parseInt(year);
	}
	
	public static void how_Many_Month_To_Jump() {
		
		if((targetMonth - currentMonth)>0) {
			
			jumpMonthBy = (targetMonth - currentMonth);
		}else {
			
			jumpMonthBy = (currentMonth - targetMonth);
			
			increment = false;
		}
		
		
	}

}
