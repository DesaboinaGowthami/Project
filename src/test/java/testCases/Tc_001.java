package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Registrationpage;
import testBase.BaseClass;

public class Tc_001 extends BaseClass
{


	@Test
	public void AccountRegistartion() throws InterruptedException {
	
		Homepage hp=new Homepage(driver);
		Registrationpage rp=new Registrationpage(driver);
		logger.debug("****Application logs*****");
		logger.info("********clicking on my account********");
		hp.click_Myact();
		hp.click_Register();
		
		Thread.sleep(5000);
		rp.setFirstname(RB.getString("firstname"));
		rp.setLastname(RB.getString("lastname"));
		rp.setEmail(RB.getString("email"));
		rp.setPassword(RB.getString("password"));
		rp.clickContinue();
				
	}


}



