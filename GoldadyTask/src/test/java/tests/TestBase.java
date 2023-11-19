package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import data.ReadProperties;

public class TestBase {

	public static WebDriver driver;
	String GoogleURL=ReadProperties.data.getProperty("URL");

	@BeforeClass
	public void startDriver() 
	{
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
//		
//		// Navigate to the demoqa website
//		driver.get(GoogleURL);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(GoogleURL);


	}

	@AfterClass
	public void stopDriver()
	{
		driver.quit();
	}
}
