package walmart.ecommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

/**
 * @author sukanyadass
 * This is the test class which uses the .java classes and 
 * performs entire End to End transaction testing
 *
 */
public class EcommerceTransactionTest {
	
	WebDriver driver = new ChromeDriver();	
	LogInPage logInPage = new LogInPage();
	SearchItem searchItem = new SearchItem();
	AddItemToCart addItemToCart = new AddItemToCart();
	String userName = "testassignment07@gmail.com";
	String password = "test#007";
	
	@Before
	public void setup()
	{
		// Opening the browser
		driver.get("https://www.walmart.com");
	}
	
	@Test
	public void testEcommerceTransaction() throws InterruptedException
	{
		// Login to https://www.walmart.com
		logInPage.signIn(driver,userName, password);
		
		// search with 'toy' keyword
		searchItem.startSearch(driver, "toys");
		
		// select the item
		addItemToCart.selectItem(driver);
		
		// add the item to the cart
		addItemToCart.addToCart(driver);
		
		// review the cart and verify that cart has only selected item
		addItemToCart.reviewCart(driver);
		
		// Validating for the correct page url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.walmart.com/cart/" );
		
		// Validating the number of item which is being added to the cart
		String itemCountXpath = "//div[@class='header-cart']//..//b[@class='js-header-cart-count header-cart-item-count']";
		String itemCount = driver.findElement(By.xpath(itemCountXpath)).getText();
		Assert.assertEquals(itemCount,"1");

	}
	
	@After
	public void closeBrowser()
	{
		// closing the browser
		driver.close();
	}

}
