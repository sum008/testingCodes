import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarTesting2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();  
		driver.get("https://fengyuanchen.github.io/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/input")).click();
		
		String Mon_year = "October 2018" ;
		String day = "14";
		
		dateCheck(Mon_year, day);
		
		
		
	}
		
		public static void dateCheck(String Mon_year,String day) throws InterruptedException {
			
			Thread.sleep(1000L);
			System.out.println("size is : " + driver.findElements(By.xpath("//li[@data-view='day']")).size());
		List <WebElement> element = driver.findElements(By.xpath("//li[@data-view='day']"));
		
		if(driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]")).getText().equals(Mon_year)) {
			
			System.out.println("month is : " + driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]")).getText());
			System.out.println("if loop");
			
			for(int i=1; i<=element.size();i++) {
				
				System.out.println(driver.findElement(By.xpath("//li[@data-view='day'][" + i + "]")).getText());
				
				if(element.get(i).getText().equals(day)) {
					
					driver.findElement(By.xpath("//li[@data-view='day'][" + (i+1) + "]")).click();
					
					return;
				}
			}
		}
		
		//IMPROVEMENT NEEDED
		else if((driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]")).getText().equals("December 2017")))
		{
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[3]")).click();
			Thread.sleep(1000L);
		 	dateCheck(Mon_year, day);
		 	return;
		 	
		}
		else if(!(driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]")).getText().equals("December 2017"))) {
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[1]")).click();
			System.out.println("We are in else loop");
		 	Thread.sleep(1000L);
		 	dateCheck(Mon_year, day);
		 	return;
		 	
			
		}  }

		}
	


