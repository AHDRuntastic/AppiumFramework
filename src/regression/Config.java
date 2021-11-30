package regression;

import org.testng.annotations.Test;

import findelements.ActivateTPElements;
import findelements.CreatorsClubElements;
import findelements.LoginLogoutElements;
import findelements.RegistrationElements;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.net.ServerSocket;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.io.IOException;


import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Config {
	
	 public static AppiumDriverLocalService service;
	 
	public AppiumDriverLocalService startserver() //method to automatically start the server and should exist in every test class
	
	{   //some dependencies should be added in the pom.xml to run this method 
		  
		boolean flag =checkIfServerIsRunning(4723);
		if(!flag) {
		  AppiumServiceBuilder builder = new AppiumServiceBuilder();

		  HashMap<String, String> env = new HashMap<>(System.getenv());
		  env.put("PATH","/usr/local/bin:" + env.get("PATH"));
		  env.put("ANDROID_HOME", "/users/ahd/Library/Android/sdk");
		  builder.withEnvironment(env);
		  
		  File nodef = new File("/usr/local/bin/node"); 
		  File appiumf = new File("/usr/local/bin/appium");
		  builder.usingDriverExecutable(nodef).withAppiumJS(appiumf).withIPAddress("127.0.0.1").usingPort(4723);
		  
		  service = AppiumDriverLocalService.buildService(builder); 
		  service.start();
		}
		  return service;
		 
		 
	}
	

	public static boolean checkIfServerIsRunning(int port)//This method to check if server is running or not before start the server
	{
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		}catch(IOException e) {
			//If control comes here that means the server is in use.
			isServerRunning = true;
		}finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	
	LoginLogoutElements loginout; // define object from the registration class
	RegistrationElements reg;
	CreatorsClubElements cc;
	ActivateTPElements ActivateTP;
	
	
	AndroidDriver<AndroidElement> driver;
 
	public AndroidDriver<AndroidElement> Capabilities() throws Exception {
		
		/*
		 * //FileInputStream to give java the ability to read file FileInputStream fis =
		 * new FileInputStream(
		 * "/Users/ahd/eclipse-workspace/appium/src/regression/global.properties");
		 * Properties prop = new Properties(); //ask to go to the file and do mapping
		 * between file and code prop.load(fis);
		 */
		
		// Read APK from folder
		File Parentfolder = new File("src");
		File APP = new File(Parentfolder,"Trainingapp.apk");

		// Define capabilities App apk, Device, 4723 server,
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 XL AHD"); // Define device name
		cap.setCapability(MobileCapabilityType.APP, APP.getAbsolutePath()); // Define your APP

		// UI-Automator ==> automate android apps
		// uiautomator2 ==> engine used internally by appium to automate android apps
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("appPackage", "com.runtastic.android.results.lite");
		cap.setCapability("appActivity", "com.runtastic.android.results.MainActivity");

		// Give port number for appium server
		// Send cap to driver to know what exactly to automate
		// wd stands for web driver
		// in Java you have to use class URL to pass the URL as string
		this.driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		loginout = new LoginLogoutElements(driver);
		reg = new RegistrationElements(driver);
		cc = new CreatorsClubElements(driver);
		ActivateTP = new ActivateTPElements(driver);
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		return driver;

	}
	

}
