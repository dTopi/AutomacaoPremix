package br.com.automacao.premix.core;

import static br.com.automacao.premix.core.DriverFactory.getDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	static ExtentReports report;
	static ExtentTest test;
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);

	public static void statusReport(String teste, String name) {
		report = new ExtentReports(System.getProperty("user.dir") + "\\target\\Reports\\" + teste + ".html");
		test = report.startTest(name);
		
	}

	@AfterClass
	public static void FinalizaClasse() {
		report.endTest(test);
		report.flush();
		DriverFactory.killDriver();
	}
	
	public void geraScrenshotPassed(String nome){
		
	}
	
	public void geraScreenshotFalied(){
		
	}
	
	/*@After 
	 public void FinalizaApp(){
		 DriverFactory.getDriver().resetApp(); 
		 }
	 */
}
