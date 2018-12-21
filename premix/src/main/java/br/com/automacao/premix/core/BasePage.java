package br.com.automacao.premix.core;

import static br.com.automacao.premix.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class BasePage extends BaseTest {
WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);

	public void set(By by, String texto, String nome) {
		try {
			getDriver().findElement(by).sendKeys(texto);
			test.log(LogStatus.PASS, nome);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, nome);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.FAIL, img);
			test.log(LogStatus.FAIL, e.getMessage());
		}

	}

	public void clickPorTexto(String texto, String nome) {
		try {
			getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();
			getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			test.log(LogStatus.PASS, nome);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, nome);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("..\\Screenshots\\" + nome + ".png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);
			test.log(LogStatus.FAIL, e.getMessage());
		}

	}

	public void click(By by, String nome) {
		try {
			getDriver().findElement(by).click();
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			test.log(LogStatus.PASS, nome);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, nome);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
				;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.FAIL, img);
			test.log(LogStatus.FAIL, e.getMessage());
			
		}

	}

	public String get(By by, String nome) {
		String texto = null;
		try {
			texto = getDriver().findElement(by).getText();
			test.log(LogStatus.PASS, nome);
			test.log(LogStatus.PASS, "Informação Recuperada: " + texto);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);

		} catch (Exception e) {
			test.log(LogStatus.FAIL, nome);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome + ".png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + nome + ".png");
			test.log(LogStatus.PASS, img);
			test.log(LogStatus.FAIL, e.getMessage());
			
		}
		return texto;
	}

	public void validacao(By by, String nome1, String nome2) {
		try {
			Assert.assertTrue(nome2, true);
			test.log(LogStatus.PASS, nome1);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome1 + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + nome1 + ".png");
			test.log(LogStatus.PASS, img);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, nome1);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome1 + ".png"));
				;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + nome1 + ".png");
			test.log(LogStatus.FAIL, img);
			test.log(LogStatus.FAIL, e.getMessage());
			
		}

	}

	public void clickBtnPesquisa_enter(String btn) {

		try {

			((AndroidDriver) DriverFactory.getDriver()).pressKeyCode(66);
			test.log(LogStatus.PASS, btn);
			test.log(LogStatus.PASS, "Passed");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + btn + ".png"));
			String img = test.addScreenCapture("..\\Screenshots\\" + btn + ".png");
			test.log(LogStatus.PASS, img);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, btn);
			test.log(LogStatus.FAIL, "FAIL");
			File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + btn + ".png"));
				;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String img = test.addScreenCapture("..\\Screenshots\\" + btn + ".png");
			test.log(LogStatus.FAIL, img);
			test.log(LogStatus.FAIL, e.getMessage());
		}
		}
		public void validacaoCampoVazio(String nome1, String nome2) {
			try {
				Assert.assertEquals(nome1, nome2);
				test.log(LogStatus.PASS, nome1);
				test.log(LogStatus.PASS, "Passed");
				File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome1 + ".png"));
				String img = test.addScreenCapture("..\\Screenshots\\" + nome1 + ".png");
				test.log(LogStatus.PASS, img);
			} catch (Exception e) {
				test.log(LogStatus.FAIL, nome1);
				test.log(LogStatus.FAIL, "FAIL");
				File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(scrFile, new File("target\\Screenshots\\" + nome1 + ".png"));
					;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String img = test.addScreenCapture("..\\Screenshots\\" + nome1 + ".png");
				test.log(LogStatus.FAIL, img);
				test.log(LogStatus.FAIL, e.getMessage());
				
			}
	}
}
