package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public static WebElement element = null;

	public static WebElement StartLogin (WebDriver driver){
		
		element = driver.findElement(By.cssSelector("span[data-reactid='477']"));

		return element;
	}
	
    public static WebElement OpenLoginPage (WebDriver driver){
		
		element = driver.findElement(By.cssSelector("a[data-track='login']"));

		return element;
	}
	

	
	public static WebElement UserLogout (WebDriver driver){

	element = driver.findElement(By.cssSelector("div[data-track='logout']"));

	return element;
	}
}
