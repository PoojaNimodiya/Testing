package AppModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.LoginPage;

public class SignIn_Action {

	WebDriver driver;
	static WebElement element = null;
	
	////This Method gets called in Modular_TC class. This method will complete the user login. 
	
	/*public static WebElement Execute(WebDriver driver){
		
		LoginPage.userNameTxtBox(driver).sendKeys("poojanimodiya16@gmail.com");
		LoginPage.userPassTxtBox(driver).sendKeys("poonam25");
		LoginPage.clickOnSubmit(driver).click();
		
		return element;
	}*/
//
	public static WebElement Execute(WebDriver driver, String userName, String passWord){
		
		LoginPage.userNameTxtBox(driver).sendKeys(userName);
		LoginPage.userPassTxtBox(driver).sendKeys(passWord);
		LoginPage.clickOnSubmit(driver).click();
		
		return element;
	}
	
}
