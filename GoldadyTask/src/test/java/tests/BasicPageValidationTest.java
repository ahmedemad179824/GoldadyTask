package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.ChromePage;


public class BasicPageValidationTest extends TestBase{

	ChromePage chromePageObject;
	String Title=ReadProperties.data.getProperty("Title");
	@Test
	private void CheckChromeTitle() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		chromePageObject = new ChromePage(driver);
//		chromePageObject.WaitUntilUiIsFinishdRendering();
		Assert.assertTrue(driver.getTitle().equals(Title));
	
		
	}

}
