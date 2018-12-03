package br.com.automacao.premix.core;

import org.openqa.selenium.By;
import static br.com.automacao.premix.core.DriverFactory.getDriver;

public class BasePage {
	public void set(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public void click(By by) {
		getDriver().findElement(by).click();
	}

	public String get(By by) {
		String texto = getDriver().findElement(by).getText();
		return texto;
	}

}
