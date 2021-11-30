package findelements;


import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import regression.Config;

//page object file
public class LoginLogoutElements extends Config{ 
	
	private AndroidDriver<AndroidElement> driver;
	
	//Login
	private By openlogingbtn = By.id("com.runtastic.android.results.lite:id/rt_login_button");
	private By emailbtn = By.id("com.runtastic.android.results.lite:id/email");
	private By passwprdbtn = By.id("com.runtastic.android.results.lite:id/password");
	private By logingbtn = By.id("com.runtastic.android.results.lite:id/loginButton");
	
	//onboarding
	private By Questionnair1btn = By.id("com.runtastic.android.results.lite:id/questionnaireContinueCta");
	private By SkipTPbtn = By.id("com.runtastic.android.results.lite:id/onboardingSuggestedPlanSkipOption");

	
	//Logout
	private By morebtn = By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.view.ViewGroup/android.widget.TextView");
	private By logoutbtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]");
	
    
			
	public LoginLogoutElements(AndroidDriver<AndroidElement> driver)  //Constructor of the class
	{
		this.driver = driver;
	}
	
	
	
	
	private AndroidElement GetOpenLoginbtn()
	{
		return driver.findElement(openlogingbtn);
		
	}
	
	private AndroidElement Getemailbtn()
	{
		return driver.findElement(emailbtn);
		
	}

	private AndroidElement Getpasswprdbtnn()
	{
		return driver.findElement(passwprdbtn);
		
	}
	
	private AndroidElement Getlogingbtn()
	{
		return driver.findElement(logingbtn);
		
	}
	
	
	
	private AndroidElement Getonboardingbtn() //onboarding
	{
		return driver.findElement(Questionnair1btn);
		
	}
	
	
	private AndroidElement Getmorebtn() //Logout
	{
		return driver.findElement(morebtn);
		
	}

	private AndroidElement Getlogoutbtn()
	{
		return driver.findElement(logoutbtn);
		
	}
	private AndroidElement GetSkipTPbtn()
	{
		return driver.findElement(SkipTPbtn);
		
	}
	
	
	
	public void login(String username, String password)
	{
		
		GetOpenLoginbtn().click();
		Getemailbtn().sendKeys(username);
		Getpasswprdbtnn().sendKeys(password);
		Getlogingbtn().click();
		
	}
	
	
	public void onboarding()
	{
		
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		
		
	}
	
	
	public void logout() 
	{
	
		Getmorebtn().click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Log out\"))");
		Getlogoutbtn().click();
		 
		
	}
	
	public void onboarding2()
	{
		
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		GetSkipTPbtn().click();
		
		
	}
	
	
	public void onboarding3()
	{
		
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		Getonboardingbtn().click();
		
		
	}
	

}
