package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class InicioPage extends BasePage {
	/*
	 * Os metodos: clickBtnDrawer clicktxtPesquisar setTxtPesquisar São comuns a
	 * todas as Page.
	 * 
	 */

	public void clickBtnDrawer() {
		click(By.id("br.com.topinformation.premix:id/left_action"), "Click Drawer");
	}

	

}
