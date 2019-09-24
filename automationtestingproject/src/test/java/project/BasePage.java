package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page {
	
	public BasePage(WebDriver driver)
	{
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
		
	}


	@Override
	public WebElement getElement(By locator) {
		WebElement element;
		try {
			element=driver.findElement(locator);
			return element;
		    }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return null;
		
		}
	

	@Override
	public String getPageheader(By locator) {
		return getElement(locator).getText();
	}

}
