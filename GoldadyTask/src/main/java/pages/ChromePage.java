package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromePage extends PageBase{

	public ChromePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//	@FindBy(id="APjFqb")
	
	public WebElement SearchField = driver.findElement(By.id("APjFqb"));
	public WebElement GoogleLogo = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img"));
	
	public void SetSearchKey(String Searchkey) {
		sendText(SearchField, Searchkey);
		SearchField.sendKeys(Keys.ENTER);;
	}
	

}
