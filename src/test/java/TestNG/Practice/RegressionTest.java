package TestNG.Practice;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.generic.BaseLoginforTestNG;
import com.generic.MasterPageFactory;
import com.generic.MercuryTours_BaseLogin;
import com.util.BaseConfig;
import com.util.DriverManager2;
import com.util.Highlighter;
import com.util.ScreenShot;

public class RegressionTest {
	
	WebDriver driver;
	Logger log = Logger.getLogger(RegressionTest.class.getName());
	
	@BeforeTest
	public void getSetup() {
		driver = DriverManager2.getDriver("chrome");
	}
	
	@Test
	public void loginTest() throws Throwable {
		BaseLoginforTestNG.getLogin(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
