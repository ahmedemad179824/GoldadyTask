package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class PageBase {

	protected WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	public void sendText(WebElement element, String text )
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public void WaitUntilUiIsFinishdRendering() {
		Boolean notRendered = true;
		String angularwait = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable())=== -1" ;
		
		while(notRendered) {
			notRendered = !Boolean.valueOf(((JavascriptExecutor) driver).executeScript(angularwait).toString());
			try {
				Thread.sleep(100);
				
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	

}
