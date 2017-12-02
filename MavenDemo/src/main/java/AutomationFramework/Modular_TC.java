package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HomePage;
import AppModule.SignIn_Action;

public class Modular_TC {

public static WebDriver driver = null;
	
	public static void main(String[]args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:/Jars/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	HomePage.StartLogin(driver).click();
	HomePage.OpenLoginPage(driver).click();
	
	//To Call this method please uncomment this method from SignIn_Action class.
	//SignIn_Action.Execute(driver);
	
	Thread.sleep(1000);
	
	HomePage.StartLogin(driver).click();
	HomePage.UserLogout(driver).click();
	
	System.out.println("Login Module Successfull......");
	
	driver.quit();
	
	}
}
