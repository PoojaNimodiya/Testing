package MavenDemoGrpID.MavenDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import MavenDemoGrpID.MavenDemo.AmazonLogin;

public class AmazonTest {
	WebDriver driver;
	
  @Test
  public void normalLogin() throws InterruptedException {
	  
	  	driver = AmazonLogin.login(driver);
	    
		driver.findElement(By.cssSelector("span[data-reactid='477']")).click();

		driver.findElement(By.cssSelector("a[data-track='login']")).click();

		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("poojanimodiya16@gmail.com");;

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("poonam25");;

		driver.findElement(By.cssSelector("button.login-login-button")).click();

		driver.findElement(By.cssSelector("span[data-reactid='477']")).click();

		String AccountHolderName = driver.findElement(By.cssSelector("div.desktop-infoTitle")).getText();
		System.out.println(AccountHolderName);	
		
		Assert.assertEquals("Pooja", AccountHolderName);
  }
  
  /*@Test
  public void facebookLogin() {
	    driver = AmazonLogin.login(driver);
	    
		driver.findElement(By.cssSelector("span[data-reactid='477']")).click();

		driver.findElement(By.cssSelector("a[data-track='login']")).click();
		
		driver.findElement(By.xpath(".//*[@id='mountRoot']/div/div/div/div[2]/div/button[1]")).click();

		Set<String> allWindows = driver.getWindowHandles();
		
		for(String s: allWindows){
			driver.switchTo().window(s);
		}
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("nimodiyapuja@yahoo.in");

		driver.findElement(By.id("pass")).sendKeys("poonam25");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
  }
  
  @Test
  public void gmailLogin() throws InterruptedException {
	 	  
	    driver = AmazonLogin.login(driver);
	    
	  	String parentWindow = driver.getWindowHandle();

		driver.findElement(By.cssSelector("span[data-reactid='477']")).click();

		driver.findElement(By.cssSelector("a[data-track='login']")).click();
		
		driver.findElement(By.cssSelector("button#gPlusLogin")).click();

		Set<String> allWindows = driver.getWindowHandles();
		
		for(String s: allWindows){
			driver.switchTo().window(s);
		}
		
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("poojanimodiya16@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("poonam25");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(parentWindow);
  }
*/
}
