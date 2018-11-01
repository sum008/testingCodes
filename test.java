import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		
		String Expectedtitle = "Google accounts";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("sk4641230@gmail.com");
		
		element = driver.findElement(By.id("next"));
		element.click();
		
		//element = driver.findElement(By.id("PersistentCookie"));
		//element.click();
		
		element = driver.findElement(By.id("Passwd"));
		element.sendKeys("google123456");
		
		element = driver.findElement(By.id("signIn"));
		element.click();
		
		String actualtitle = driver.getTitle();
		if(actualtitle.contentEquals(Expectedtitle)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("failed");
		}
				
		//driver.close();

	}

}
