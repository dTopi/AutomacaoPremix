package br.com.automacao.premix.core;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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

	
	/*@After 
	 public void FinalizaApp(){
		 DriverFactory.getDriver().resetApp(); 
		 }
	 */
}
