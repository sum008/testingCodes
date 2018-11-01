import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class html_unit_driver {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		System.out.println("done");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sk4641230@gmail.com");
		System.out.println("done1");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		System.out.println("done2");
		driver.findElement(By.name("password")).sendKeys("sdfsdfsd");
		System.out.println("done3");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
		System.out.println("done4");
	}

}
