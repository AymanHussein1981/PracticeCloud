package Framework.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base01Test {
	
	
	
	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> cloudcapabilities(String appName) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
	

		cap.setCapability("browserstack.user", "aymanhussein_2lfkWo");
    	cap.setCapability("browserstack.key", "rdetUXieM8xsqtW27PKV");
    	if(appName.equalsIgnoreCase("APIDemoApp"))
    	{
    		cap.setCapability("app","bs://34f36789fb6eae61939d84cf3e28803c016690f6");

    	}
    	else
    	{
    		cap.setCapability("app","bs://83e579ced335f71d53f97e06571b157e753f8662");
    	}

    	
    	
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
    	cap.setCapability("device", "Google Pixel 3");
    	cap.setCapability("os_version", "9.0");
    	
    	
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		
		 driver =new AndroidDriver<>(new URL("http://hub.browserstack.com/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		return driver;
		

	}
	
	public static void getscreenshot(String s) throws IOException
	{
		File scrnfile =driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnfile, new File(System.getProperty("user.dir")+"\\"+s+".png"));
	}

}
