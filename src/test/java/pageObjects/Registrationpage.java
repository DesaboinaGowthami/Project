package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage extends Basepage{

	public Registrationpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement text_email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd;
	@FindBy(xpath="//button[text()='Continue']")
	WebElement btn_continue;
	public void setFirstname(String uname) {
		txt_firstname.sendKeys(uname);
	}
	public void setLastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	public void setEmail(String mailid) {
		text_email.sendKeys(mailid);
	}
	public void setPassword(String password) {
		txt_pwd.sendKeys(password);
	}
	public void clickContinue() 
	{
		btn_continue.click();
	}
}




