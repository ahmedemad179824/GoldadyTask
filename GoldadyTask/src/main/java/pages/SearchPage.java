package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement FirstResult = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.kb0PBd.cvP2Ce.jGGQ5e > div > div > span > a > h3"));

}
