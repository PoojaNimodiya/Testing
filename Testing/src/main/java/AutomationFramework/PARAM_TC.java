package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AppModule.SignIn_Action;
import PageObject.HomePage;

import utility.Constants;

public class PARAM_TC {

public static WebDriver driver = null;
	
	public static void main(String[]args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:/Jars/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(Constants.url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	HomePage.StartLogin(driver).click();
	HomePage.OpenLoginPage(driver).click();
	
	//Uncomment this line when passing the username/password directly from method call.
	//SignIn_Action.Execute(driver, "poojanimodiya16@gmail.com", "poonam25");
	
	//Method call taking the parameter from constants class. 
	SignIn_Action.Execute(driver,Constants.userName, Constants.passWord );
	
	Thread.sleep(1000);
	
	HomePage.StartLogin(driver).click();
	HomePage.UserLogout(driver).click();
	
	System.out.println("Login Param Successfull......");
	
	driver.quit();
	
	}
}
