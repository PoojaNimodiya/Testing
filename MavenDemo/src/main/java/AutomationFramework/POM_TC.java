package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.HomePage;
import PageObject.LoginPage;

public class POM_TC {
	
	public static WebDriver driver = null;
	
	public static void main(String[]args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:/Jars/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//This class is getting called from PageObject package.
	
	HomePage.StartLogin(driver).click();
	HomePage.OpenLoginPage(driver).click();
	
	LoginPage.userNameTxtBox(driver).sendKeys("poojanimodiya16@gmail.com");
	LoginPage.userPassTxtBox(driver).sendKeys("poonam25");
	LoginPage.clickOnSubmit(driver).click();
	
	Thread.sleep(1000);
	
	HomePage.StartLogin(driver).click();
	HomePage.UserLogout(driver).click();
	
	System.out.println("Login Successfull......");
	
	driver.quit();
	
	}

}
