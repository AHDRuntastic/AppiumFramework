package findelements;



import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import regression.Config;

public class CreatorsClubElements extends Config{
	
	
	private AndroidDriver<AndroidElement> driver;
	
	private By Premiumxbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	private By morebtn = By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.view.ViewGroup/android.widget.TextView");
	private By Creatorsclubbtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.Button");
	//private By Challenger = By.id("com.runtastic.android.results.lite:id/currentLevel");
	//private By Levels = By.id("com.runtastic.android.results.lite:id/levelTitle");
	//private By FBcard = By.id("com.runtastic.android.results.lite:id/feedbackCardCta");
	private By History = By.xpath("//android.widget.LinearLayout[@content-desc=\"HISTORY\"]/android.widget.TextView");
	private By Overview = By.xpath("//android.widget.LinearLayout[@content-desc=\"OVERVIEW\"]/android.widget.TextView");
    private By MoreOption = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    private By Givefeedback = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	private By FBclosebtn = By.id("com.runtastic.android.results.lite:id/close_icon");
    //private By OpenFAQs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    //private By FBtext = By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
	private By Creatorspass = By.id("com.runtastic.android.results.lite:id/passViewTitle");
	private By PassGet = By.id("com.runtastic.android.results.lite:id/explanationCta");
	//private By Challenger = By.id("com.runtastic.android.results.lite:id/userLevel");
	private By Navigateback = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	private By Earnpoints = By.id("com.runtastic.android.results.lite:id/pointsInfoViewTitle");
	//private By AdidasT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
	//private By AdidasR = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
	private By ShowMore1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
	private By ShowMore2 = By.id("com.runtastic.android.results.lite:id/showMoreLessText");
    private By ShowMore3 = By.id("com.runtastic.android.results.lite:id/showMoreLessText");
    private By Pointsbackbtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	private By SelectLevel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]");
	//private By levelCheck = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView");
	
	public CreatorsClubElements(AndroidDriver<AndroidElement> driver)  //Constructor of the class
	{
		this.driver = driver;
	}
	
	
	private AndroidElement GetPremiumxbtn()
	{
		return driver.findElement(Premiumxbtn);
		
	}	
	private AndroidElement Getmorebtn()
	{
		return driver.findElement(morebtn);
		
	}	
	private AndroidElement GetCreatorsclubbtn()
	{
		return driver.findElement(Creatorsclubbtn);
		
	}
	
	
	//Creators Club
	private AndroidElement GetHistory()
	{
		return driver.findElement(History);
		
	}	
	private AndroidElement GetOverview()
	{
		return driver.findElement(Overview);
		
	}	
	private AndroidElement GetMoreOption()
	{
		return driver.findElement(MoreOption);
		
	}
	private AndroidElement GetCreatorspass()
	{
		return driver.findElement(Creatorspass);
		
	}	
	private AndroidElement GetPassGet()
	{
		return driver.findElement(PassGet);
		
	}	
	private AndroidElement GetNavigateback()
	{
		return driver.findElement(Navigateback);
		
	}	
	private AndroidElement GetGivefeedback()
	{
		return driver.findElement(Givefeedback);
		
	}
	private AndroidElement GetEarnpoints()
	{
		return driver.findElement(Earnpoints);
		
	}	
	private AndroidElement GetShowMore1()
	{
		return driver.findElement(ShowMore1);
		
	}	
	private AndroidElement GetShowMore2()
	{
		return driver.findElement(ShowMore2);
		
	}	
	private AndroidElement GetShowMore3()
	{
		return driver.findElement(ShowMore3);
		
	}	
	private AndroidElement Pointsbackbtn()
	{
		return driver.findElement(Pointsbackbtn);
		
	}	
	private AndroidElement GetSelectLevel()
	{
		return driver.findElement(SelectLevel);
		
	}
	private AndroidElement GetFBclosebtn()
	{
		return driver.findElement(FBclosebtn);
		
	}	
	
	
	
	public void OpenCreatorsClub() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 10);  //explicit wait
		//wait.until(ExpectedConditions.invisibilityOf(Getmorebtn()));
		
		Getmorebtn().click();
		GetCreatorsclubbtn().click();
		//Assert for Feedback text and Challenger
	}
	
	
	public void checktabs()
	{
		GetHistory().click();
		GetOverview().click();
		GetMoreOption().click();
		//Assert for Givefeedback and FAQs
		
	}
	
	
	public void viewcreatorpass()
	{
		GetGivefeedback().click();
		GetFBclosebtn().click();
		GetCreatorspass().click();
		GetPassGet().click();
		//Assert for challenger word
	}
	
	
	
	public void earnpoints1()
	{
		
		GetNavigateback().click();
		GetEarnpoints().click();
		
		//Assert for Adidas Training and Running
	}
	
	
	public void earnpoints2()
	{
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Plogging\"))");
		GetShowMore1().click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"OPEN ADIDAS RUNNING\"))");
		GetShowMore2().click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Complete a Challenge\"))");
		GetShowMore3().click();
		
	}
	
	public void CheckLevel()
	{
		Pointsbackbtn().click();
		GetSelectLevel().click();
		//Assert for Level
	}
	
	

}
