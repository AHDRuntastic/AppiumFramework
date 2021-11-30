package regression;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.Reporter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatorsClubTC extends Config {
	
	
	@Test(priority=1)
	public void initiatecap() throws Exception
	{
	   service=startserver();
	   AndroidDriver<AndroidElement> driver = Capabilities();
	
	}
	
	
	@Test(priority=2)
	public void FullCreatorsClubTC() throws InterruptedException
	{
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		loginout.onboarding3();
		
		
		ActivateTP.StartSuggestedTP();
		String ActualResult0 = driver.findElement(By.id("com.runtastic.android.results.lite:id/view_training_plan_progress_week_title")).getText();
		String ExpectedResult0 = "WEEK 1";
		Assert.assertEquals(ActualResult0, ExpectedResult0);
		
		cc.OpenCreatorsClub();
		//to Check Challenger section is exist
		String ActualResult1 = driver.findElement(By.id("com.runtastic.android.results.lite:id/currentLevel")).getText();
		String ExpectedResult1 = "CHALLENGER";
		Assert.assertEquals(ActualResult1, ExpectedResult1);
		//to Check Levels section is exist
		String ActualResult2 = driver.findElement(By.id("com.runtastic.android.results.lite:id/levelTitle")).getText();
		String ExpectedResult2 = "LEVELS";
		Assert.assertEquals(ActualResult2, ExpectedResult2);
		Reporter.log("Creators Club is openned successfully");
		
		
		cc.checktabs();
		//to Check Givefeedback and FAQs
		String ActualResult3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).getText();
		String ExpectedResult3 = "Open FAQs";
		Assert.assertEquals(ActualResult3, ExpectedResult3);
		
		String ActualResult4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).getText();
		String ExpectedResult4 = "Give Feedback";
		Assert.assertEquals(ActualResult3, ExpectedResult3);
		Reporter.log("Overview tab and History tab checked successfully");
		Reporter.log("More options are shown successfully");
		
		
		cc.viewcreatorpass();
		//to Check CC pass is shown
		String ActualResult5 = driver.findElement(By.id("com.runtastic.android.results.lite:id/userLevel")).getText();
		String ExpectedResult5 = "CHALLENGER";
		Assert.assertEquals(ActualResult2, ExpectedResult2);
		Reporter.log("Creator pass is shown successfully");
		
		cc.earnpoints1();
		cc.earnpoints2();
		cc.CheckLevel();
		String ActualResult6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView")).getText();
		String ExpectedResult6 = "LEVEL REWARDS";
		Assert.assertEquals(ActualResult6, ExpectedResult6);
		Reporter.log("Earn points is shown and show-more buttons are working successfully");
		Reporter.log("Levels checked and can be opened successfully");
		
		service.stop();
		
	}
	

}
