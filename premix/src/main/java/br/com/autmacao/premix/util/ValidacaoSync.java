package br.com.autmacao.premix.util;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class ValidacaoSync extends BasePage{
   
	public void validaLeadSalvo(){
		String mensagem = get(By.id("android:id/message"), "Validação mesangem de salvar");
		if (mensagem == "Lead salvo com sucesso"){
			click(By.id("android:id/button3"), "Click OK");
		}
			
		
	}
}
