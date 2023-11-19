package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.ChromePage;
import pages.SearchPage;

@Test
public class SearchFunctionalityValidationTest extends TestBase{

	ChromePage chromePageObject;
	SearchPage searchPageOpject;
	String SearchKey=ReadProperties.data.getProperty("SearchKey");
	String FirstResult=ReadProperties.data.getProperty("FirstSearchResult");

	public void AssertForSearch() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		chromePageObject = new ChromePage(driver);
		
		wait.until(ExpectedConditions.visibilityOf(chromePageObject.SearchField));
		chromePageObject.SetSearchKey(SearchKey);
		searchPageOpject = new SearchPage(driver);
		wait.until(ExpectedConditions.visibilityOf(searchPageOpject.FirstResult));
		System.out.println(searchPageOpject.FirstResult.getText());
		Assert.assertTrue(searchPageOpject.FirstResult.getText().equals(FirstResult));


	}

}
