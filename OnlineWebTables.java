import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class OnlineWebTables {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://scores.sify.com/live-cricket-scores/India-tour-of-England-2018/ESSEX_vs_INDIA_JUL25_JUL27_2018.shtml");
		
		
	
		
		for(int r=1;r<=19;r++) {
			
			for(int c=1;c<=2;c++) {
				
				char d = (char)r;
				char e = (char)c;
	//System.out.println(driver.findElements(By.xpath("//*[@id='scorecardbatingbowlinginnings3']/table[1]/tbody/tr[d]/td[e]")).size());
			  
			}
			System.out.println(driver.findElements(By.xpath("//*[@id='scorecardbatingbowlinginnings3']/table[1]/tbody/tr[d]/td[1]")).size());				
		}
	}

}
