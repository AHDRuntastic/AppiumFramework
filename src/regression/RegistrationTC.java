package regression;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Reporter;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class RegistrationTC extends Config {
	
	@Test(priority=1)
	public void initiatecap() throws Exception
	{
	   service=startserver();
	   AndroidDriver<AndroidElement> driver = Capabilities();
	
	}
	
	@Test(priority=2)
	public void FullRegistrationTC() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		reg.Registration("AHD", "DIAA", "ahd+11252@runtastic.com","Testtest1234");
		Reporter.log("The user is registered successfully");
		loginout.onboarding2();
		Reporter.log("The onboarding is passed successfully");
		//driver.resetApp();
		service.stop();
		
	}
	
	
	
	
	

}
