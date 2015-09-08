package walmart.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author sukanyadass
 * This class logs  into the "https://www.walmart.com" web site with a provided user-id & password
 *
 */

public class LogInPage {
	
	private static final String SIGN_IN_XPATH = "//a[@class='header-account-signin']";
	private static final String USERNAME_XPATH = "//input[@id='login-username']";
	private static final String PASSWORD_XPATH = "//input[@id='login-password']";
	private static final String SIGN_IN_BUTTON_XPATH = "//button[@data-automation-id='login-sign-in']";

	public void signIn(WebDriver driver, String userName, String password) throws InterruptedException {
		
		driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
		driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys(userName);
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
		driver.findElement(By.xpath(SIGN_IN_BUTTON_XPATH)).click();
	}

}
