import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class UploadFile {

	public static void main(String[] args) throws FindFailed {
		
		Screen screen = new Screen();
		
		Pattern img1 = new Pattern("C:\\Users\\Sumit\\Desktop\\loc.png");
		Pattern img2 = new Pattern("C:\\Users\\Sumit\\Desktop\\open.png");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zamzar.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"inputFile\"]")).click();
		
		screen.wait(img1, 10);
		
		screen.type(img1, "C:\\Users\\Sumit\\Desktop.piezoimg.png");
		
		screen.click(img2);

	}

}
