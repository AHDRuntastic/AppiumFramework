package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import regression.Config;

public class RegistrationElements extends Config {
	
	private AndroidDriver<AndroidElement> driver;
	
	//Registration Screen
	private By Signup = By.id("com.runtastic.android.results.lite:id/mail_sign_up_button");
	private By Fname = By.id("com.runtastic.android.results.lite:id/firstName");
	private By Lname = By.id("com.runtastic.android.results.lite:id/lastName");
	private By Gender = By.id("com.runtastic.android.results.lite:id/maleIcon");
	private By Email = By.id("com.runtastic.android.results.lite:id/email");
	private By PW = By.id("com.runtastic.android.results.lite:id/password");
	private By Location = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[1]");
	private By Birthday = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[1]");
	private By Year = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText");
	private By Year2 = By.id("android:id/pickers");
	private By SetBD = By.id("android:id/button1");
	private By Join = By.id("com.runtastic.android.results.lite:id/textView2");
	
	
	
	//Registration Flow
	private By Termsbtn = By.id("com.runtastic.android.results.lite:id/acceptButton");
	private By Consntbtn = By.id("com.runtastic.android.results.lite:id/primaryButton");

	
	
	
	public RegistrationElements(AndroidDriver<AndroidElement> driver)  //Constructor of the class
	{
		this.driver = driver;
	}
	
	
	//Registration Screen
	private AndroidElement GetSignup()
	{
		return driver.findElement(Signup);
		
	}
	private AndroidElement GetFname()
	{
		return driver.findElement(Fname);
		
	}
	private AndroidElement GetLname()
	{
		return driver.findElement(Lname);
		
	}
	private AndroidElement GetGender()
	{
		return driver.findElement(Gender);
		
	}
	private AndroidElement GetEmail()
	{
		return driver.findElement(Email);
		
	}
	private AndroidElement GetPW()
	{
		return driver.findElement(PW);
		
	}
	private AndroidElement GetLocation()
	{
		return driver.findElement(Location);
		
	}
	private AndroidElement GetBirthday()
	{
		return driver.findElement(Birthday);
		
	}
	private List<AndroidElement> GetYear()
	{
		return driver.findElements(Year);
		
	}
	private AndroidElement GetYear2()
	{
		return driver.findElement(Year2);
		
	}
	private AndroidElement GetSetBD()
	{
		return driver.findElement(SetBD);
		
	}
	private AndroidElement GetJoin()
	{
		return driver.findElement(Join);
		
	}
	
	
	//Registration Flow
	private AndroidElement GetTermsbtn()
	{
		return driver.findElement(Termsbtn);
		
	}
	private AndroidElement GetConsentbtn()
	{
		return driver.findElement(Consntbtn);
		
	}
	
	
	public void Registration(String Fname, String Lname, String Email, String PW) throws InterruptedException
	{
		GetSignup().click();
		GetFname().sendKeys(Fname);
		GetLname().sendKeys(Lname);
		GetGender().click();
		GetEmail().sendKeys(Email);
		GetPW().sendKeys(PW);
		GetBirthday().click();
		GetYear().get(0).clear();
		GetYear().get(0).sendKeys("1990");
		GetYear().get(0).click();
		GetSetBD().click();
		GetJoin().click();
		GetTermsbtn().click();
		GetConsentbtn().click();
		
	}
	
	

}
