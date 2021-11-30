package regression;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginLogoutTC extends Config {
	
	@Test(priority=1)
	public void initiatecap() throws Exception
	{
	   service=startserver();
	   AndroidDriver<AndroidElement> driver = Capabilities();
	
	}
	
	
	
	@Test(priority=2)
	public void LoginOnboardingLogoutTC() {
		loginout.login("ahd+4@runtastic.eu", "Testtest1");
		Reporter.log("The user logged in successfully"); // to add logs
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // to wait till the app is started

		loginout.onboarding();
		Reporter.log("The user passed onboarding successfully"); // to add logs

		loginout.logout();
		String ActualResult = driver.findElement(By.id("com.runtastic.android.results.lite:id/rt_login_button"))
				.getText();
		String ExpectedResult = "LOG IN";
		Assert.assertEquals(ActualResult, ExpectedResult);
		Reporter.log("User logged out successfully");
		//service.stop();
	}
	

}
