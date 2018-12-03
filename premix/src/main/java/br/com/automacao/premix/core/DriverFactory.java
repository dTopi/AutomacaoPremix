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
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
