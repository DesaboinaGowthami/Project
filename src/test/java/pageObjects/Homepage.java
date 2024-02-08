package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement btn_Myacct;
	@FindBy(xpath="//a[text()='Register']")
	WebElement btn_Register;
	public void click_Myact() {
		btn_Myacct.click();
	}
	public void click_Register() {
		btn_Register.click();
	}
}


