package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	private By my_acc_click=By.xpath("//span[text()='My Account']");


	private By signin_btn_click=By.xpath("//*[@id='account_info_4']/div[2]/a[1]");


	private By send_username=By.xpath("login_popup4");

	private By send_password=By.xpath("psw_popup");

	private By sign_btn_click=By.xpath("//button[@class='ty-btn__login ty-btn__secondary ty-btn']");

	public WebElement getMy_acc_click() {
		return getElement(my_acc_click);
	}

	public WebElement getSignin_btn_click() {
		
		return getElement(signin_btn_click);
	}



	public WebElement getSend_username() {
		return getElement(send_username);
	}


	public WebElement getSend_password() {
		return getElement(send_password);
	}

	public WebElement getSign_btn_click() {
		return getElement(sign_btn_click);
	}

	public void doLogin()
	{
		try {
			getMy_acc_click().click();
			getSignin_btn_click().click();
			getSend_username().sendKeys("customer@example.com");
			getSend_password().sendKeys("customer");
			getSign_btn_click().click();

		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
