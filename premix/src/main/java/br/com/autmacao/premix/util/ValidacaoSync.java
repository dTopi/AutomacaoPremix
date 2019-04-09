package br.com.autmacao.premix.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automacao.premix.core.BasePage;
import br.com.automacao.premix.core.DriverFactory;

public class ValidacaoSync extends BasePage{
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
	public void validaLeadSalvo(){
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button3")));
		String mensagem = get(By.id("android:id/message"), "Validação mesangem de salvar");
		if (mensagem == "Lead salvo com sucesso"){
			click(By.id("android:id/button3"), "Click OK");
		}
			
		
	}
}
