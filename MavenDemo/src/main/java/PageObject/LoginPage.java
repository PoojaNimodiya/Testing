package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement element = null;
	
		public static WebElement userNameTxtBox(WebDriver driver){
			
			element = driver.findElement(By.cssSelector("input[type='email']"));

			return element;
		}

		public static WebElement userPassTxtBox(WebDriver driver){
			
			element = driver.findElement(By.cssSelector("input[type='password']"));

			return element;
		}
		
		public static WebElement clickOnSubmit(WebDriver driver){
			
			element = driver.findElement(By.cssSelector("button.login-login-button"));

			return element;
		}

}
