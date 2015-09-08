package walmart.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author sukanyadass
 * This class searches for a particular 
 * item which is sent as the search keyword
 *
 */
public class SearchItem {

	private static final String SEARCH_BOX_CLASS_NAME = 
	"//input[@class='js-searchbar-input js-header-instant-placeholder searchbar-input tt-input']";
	private static final String SEARCH_BUTTON_CLASS_NAME = 
			"//button[@class='searchbar-submit js-searchbar-submit']";
	
	public void startSearch(WebDriver driver, String searchText)
	{
		driver.findElement(By.xpath(SEARCH_BOX_CLASS_NAME)).sendKeys(searchText);
		driver.findElement(By.xpath(SEARCH_BUTTON_CLASS_NAME)).click();
	}
}
