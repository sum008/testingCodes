
import java.util.Scanner;

import org.apache.commons.net.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Encoding_decoding {
	

	public static String decode(String Encode) {
		
		byte[] Decoded = Base64.decodeBase64(Encode);
		return new String(Decoded);
	}

	public static void main(String[] args) throws InterruptedException {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter password");
		
		 String s = c.nextLine();
		
		byte[] Encoded = Base64.encodeBase64(s.getBytes());
		 String x =new String(Encoded);
		 System.out.println(x);
		

			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		
	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7210570625");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(decode(x));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		
			

	}

}
