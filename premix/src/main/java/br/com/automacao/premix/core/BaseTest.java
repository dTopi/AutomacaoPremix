package br.com.automacao.premix.core;

import static br.com.automacao.premix.core.DriverFactory.getDriver;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.corba.se.spi.orbutil.fsm.Action;

import io.appium.java_client.TouchAction;
import javafx.scene.shape.MoveTo;

public class BaseTest {
	static ExtentReports report;
	static ExtentTest test;
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
	TouchAction action = new TouchAction(DriverFactory.getDriver());
	
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
	
	public void scroll(double inicio, double fim){
		 Dimension size = getDriver().manage().window().getSize();
		 int x = size.width/2;
		 int start_y = (int) (size.height* inicio);
		 int end_y = (int) (size.height* fim);
		 new TouchAction(DriverFactory.getDriver())
		 //.longPress(x, start_y)
		 .press(x, start_y)
		 .waitAction(Duration.ofMillis(500))
		 .moveTo(x, end_y)
		 .release()
		 .perform();
		}
	/*@After 
	 public void FinalizaApp(){
		 DriverFactory.getDriver().resetApp(); 
		 }
	 */
}
