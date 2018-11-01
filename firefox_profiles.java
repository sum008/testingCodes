import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class firefox_profiles {

	public static void main(String[] args) {
	    ProfilesIni listprofile = new ProfilesIni();
	    FirefoxProfile profile = listprofile.getProfile("selenium");
	    
	    WebDriver driver = new FirefoxDriver(profile);
	    WebDriver driver1 = new FirefoxDriver(profile);
	    
	    driver.get("http://gmail.com");
	    driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	    driver1.get("http://facebook.com");
	    
	    System.out.println(driver.getTitle());
	    driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	    System.out.println(driver1.getTitle());
	    
	    

	}

}
