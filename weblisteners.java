import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class weblisteners extends AbstractWebDriverEventListener {
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("clicked on object");
	}
	
	public void afterNavigateBack(WebDriver driver) {
		
		System.out.println("moved back");
	}

}
