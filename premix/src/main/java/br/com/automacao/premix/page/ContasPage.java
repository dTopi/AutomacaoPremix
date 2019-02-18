package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;
import br.com.automacao.premix.core.DriverFactory;

public class ContasPage extends BasePage {
	/*
	 * Os metodos: clickBtnDrawer clicktxtPesquisar setTxtPesquisar São comuns a
	 * todas as Page.
	 * 
	 */

	public String getRazaosocial() {
		String rzSocial = null;
		rzSocial = get(By.id("br.com.topinformation.premix:id/tv_name_account"), "Get Razao Social");
		if(rzSocial == null)
		{
			DriverFactory.killDriver();
		}
		return rzSocial;

	}

	public String getNomeFazenda() {
		String nomeFazenda = null;
		nomeFazenda = get(By.id("br.com.topinformation.premix:id/tv_farm_name_account"), "Get Nome da Fazenda");
		return nomeFazenda;
	}

	/*public void validarResultadoBusca(String campo, String nome) {
		validacao(campo, nome);
	}*/

	public void clickBtnPesquisar() {
		clickBtnPesquisa_enter("Click Pesquisar");
	}

	public void validarBuscaVazia() {
		String nome1 = get(By.id("br.com.topinformation.premix:id/tv_empty_list"), "Verificando se a lista está vazia");
		validacaoCampoVazio(nome1, "Nenhum item foi encontrado para esta lista");
	}
}
