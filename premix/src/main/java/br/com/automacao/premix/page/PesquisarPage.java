package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class PesquisarPage extends BasePage{
	public void btnVoltar(){
		click(By.id("br.com.topinformation.premix:id/left_action"), "voltar tela de incio");
		
	}
	public void clickTxtPesquisar() {
		click(By.id("br.com.topinformation.premix:id/search_bar_text"), "Aba pesquisar");
	}

	public void setTxtPesquisar(String texto) {
		set(By.id("br.com.topinformation.premix:id/search_bar_text"), texto, "Set" + texto);

	}
}