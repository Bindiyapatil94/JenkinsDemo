package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	public Page page;
	@BeforeMethod
	public void setuptesting()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    // driver.get(propertyfile1.getProperty("ChromeExe"));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		page=new BasePage(driver);
		
	}
		@AfterMethod
		public void TesrDown()
		{
			driver.quit();
		}


}
