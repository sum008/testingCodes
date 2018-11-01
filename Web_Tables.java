import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Tables {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String xpath) {
		
		try {
			
			driver.findElement(By.xpath(xpath));
			return true;
		}catch(Throwable t) {
			
			return false;
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String start = "//*[@id='innings_1']/div[1]/div[";
		String mid = "]/div[" ;                                  //*[@id='innings_1']/div[1]/div[2]/div[1]
		String end= "]";
		/*int x = 2;
		
		while(isElementPresent(start + x + mid + 1+ end)) {
			
			System.out.println("row is :"+ x);
			System.out.println("running");
			x++;
		} */
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20353/wi-vs-ban-3rd-odi-bangladesh-tour-of-west-indies-2018");
		
		//int col = 0;
		//int row = 0;
		for(int i=2;i<=10;i++) {
			
			for(int j=1;j<=7;j++) {
			
			System.out.print("  || " + driver.findElement(By.xpath(start + i + mid + j + end)).getText());
			//col = col+1;
			//System.out.println("      column is : " + col);
		}
			//col = 0;
		  // row++;	
		  // System.out.println("       row is :" + row);
			System.out.println("      \t");
			System.out.println("------------------------------------------------------------------------------------------");
			
		} 
		
	} 

	}
