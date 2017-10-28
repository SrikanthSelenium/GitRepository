package setuptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPage {

	@FindBy(id="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath=("//input[@type='submit']"))
	WebElement submit;

	public LoginTestPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void login() throws InterruptedException
	{
		username.sendKeys("Admin");
		password.sendKeys("admin");
		submit.click();
		
		
	}
}

