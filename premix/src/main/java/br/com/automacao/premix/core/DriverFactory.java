package br.com.automacao.premix.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	public static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("PlatformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automator", "uiautomator2");
		capabilities.setCapability("appPackage", "br.com.topinformation.premix");
		capabilities.setCapability("appActivity", "br.com.topinformation.premix.main.view.activity.SplashActivity_");
		capabilities.setCapability("noReset", "true"); 
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		
	}
	
}

