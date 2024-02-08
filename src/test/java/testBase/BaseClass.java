package testBase;

import java.time.Duration;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass 
{
	public WebDriver driver;
public ResourceBundle RB;
public Logger logger;

@BeforeClass
public void setup() {
	RB=ResourceBundle.getBundle("config");
	logger=LogManager.getLogger(this.getClass());//get class name of logs file
	driver=new ChromeDriver();
	driver.get(RB.getString("baseURL"));
	logger.info("***********Launched Webpage**********");
	driver.manage().window().maximize();
	logger.info("*****Maximized webpage**********");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	logger.info("******Implicit wait applied******");
}

@AfterClass
public void close() {
	driver.quit();
}



}
