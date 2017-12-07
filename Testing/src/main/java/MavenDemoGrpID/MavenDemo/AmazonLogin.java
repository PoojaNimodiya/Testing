package MavenDemoGrpID.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AmazonLogin {

	static WebDriver driver;
	private static EventFiringWebDriver e_driver;
	private static WebEventListener eventListener;
	
	
	public static void main(String[] args) {	
	}
	
	public static WebDriver login(WebDriver driver){
		System.setProperty("webdriver.chrome.driver", "C:/Jars/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
	
		e_driver.get("https://www.myntra.com/");
		e_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		return e_driver;
	}

}
