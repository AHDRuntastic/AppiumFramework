package findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import regression.Config;

public class ActivateTPElements extends Config {
	
	private AndroidDriver<AndroidElement> driver;
	
	
	private By StartSugTP = By.id("com.runtastic.android.results.lite:id/onboardingSuggestedPlanStartCta");
	private By Exerciseperweek = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView");
	private By Next1 = By.id("com.runtastic.android.results.lite:id/questionnaireCta");
	private By Fit = By.id("com.runtastic.android.results.lite:id/question_fitness_level_fit");
	private By Day1 = By.id("com.runtastic.android.results.lite:id/day_3");
	private By Day2 = By.id("com.runtastic.android.results.lite:id/day_1");
	private By Day3 = By.id("com.runtastic.android.results.lite:id/day_5");
	private By WorkoutDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.Button");
	private By Bookmark = By.id("com.runtastic.android.results.lite:id/list_item_workout_header_bookmark_button");

	
	
	
	
	
	
	public ActivateTPElements(AndroidDriver<AndroidElement> driver)  //Constructor of the class
	{
		this.driver = driver;
	
	}
	
	
	
	private AndroidElement GetStartSugTP()
	{
		return driver.findElement(StartSugTP);
		
	}
	private AndroidElement GetExerciseperweek()
	{
		return driver.findElement(Exerciseperweek);
		
	}
	private AndroidElement GetNext1()
	{
		return driver.findElement(Next1);
		
	}
	private AndroidElement GetFit()
	{
		return driver.findElement(Fit);
		
	}
	private AndroidElement GetDay1()
	{
		return driver.findElement(Day1);
		
	}
	private AndroidElement GetDay2()
	{
		return driver.findElement(Day2);
		
	}
	private AndroidElement GetDay3()
	{
		return driver.findElement(Day3);
		
	}
	private AndroidElement GetWorkoutDetails()
	{
		return driver.findElement(WorkoutDetails);
		
	}
	private AndroidElement GetBookmark()
	{
		return driver.findElement(Bookmark);
		
	}
	
	
	public void StartSuggestedTP()
	{
		GetStartSugTP().click();
		GetExerciseperweek().click();
		GetNext1().click();
		GetFit().click();
		GetNext1().click();
		GetNext1().click();
		GetDay1().click();
		GetDay2().click();
		GetDay3().click();
		GetNext1().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		GetWorkoutDetails().click();
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	}
	
	
	
	

}
