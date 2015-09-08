package walmart.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 * @author sukanyadass
 * This class selects the item, 
 * adds the item to the cart and 
 * then reviews the cart 
 *
 */
public class AddItemToCart {
	
	private static final String ITEM_CATEGORY_XPATH = 
			"//span[@title='Outdoor Play']";
	private static final String ITEM_SUBCATEGORY_XPATH =
			"//div[@class='lhn-menu-flyout-inner lhn-menu-flyout-1col']/ul[@class='block-list']/li[@data-name='Bounce Houses & Ball Pits']";
	private static final String ITEM_XPATH =
			"//a[@href='/ip/Little-Tikes-Jump-n-Slide-Bouncer/40626698";
	private static final String ADD_CART_BUTTON_ID = "WMItemAddToCartBtn";
	private static final String  VIEW_CART_BUTTON_ID = "PACViewCartBtn";
	
	public void selectItem(WebDriver driver)
	{
		Actions builder = new Actions(driver);
		WebElement category = driver.findElement(By.xpath(ITEM_CATEGORY_XPATH));
		builder.moveToElement(category).perform();
		WebElement subcategory = driver.findElement(By.xpath(ITEM_SUBCATEGORY_XPATH));
		builder.moveToElement(subcategory).click().build().perform();
		
		driver.findElement(By.xpath(ITEM_XPATH)).click();
	}
	
	public void addToCart(WebDriver driver)
	{
		driver.findElement(By.id(ADD_CART_BUTTON_ID)).click();
	}
	
	public void reviewCart(WebDriver driver)
	{
		driver.findElement(By.id(VIEW_CART_BUTTON_ID)).click();
	}

}
