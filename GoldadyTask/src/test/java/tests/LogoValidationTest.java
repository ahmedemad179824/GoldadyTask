package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.ChromePage;

public class LogoValidationTest extends TestBase{
	
	ChromePage chromePageObject;

	@Test
	private void CheckChromeLogo() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		chromePageObject = new ChromePage(driver);
		wait.until(ExpectedConditions.visibilityOf(chromePageObject.GoogleLogo));

		boolean imagePresent = chromePageObject.GoogleLogo.isDisplayed();
		Assert.assertTrue(imagePresent, "There is no logo displayed");
	
		
	}

}
