package br.com.automacao.premix.page;

import br.com.automacao.premix.core.BasePage;

public class DrawerPage extends BasePage {

	public void clickIncio() {
		clickPorTexto("Início", "Click Inicio");

	}

	public void clickCompromissos() {
		clickPorTexto("Compromissos", "Click compromissos");

	}

	public void clickTarefas() {
		clickPorTexto("Tarefas", "Click Tarefas");

	}

	public void clickContas() {
		clickPorTexto("Contas", "Click Contas");
	}

	public void clickContatos() {
		clickPorTexto("Contatos", "Click contatos");
	}

	public void clickOportunidades() {
		clickPorTexto("Oportunidades", "Click oportunidades");
	}

	public void clickPedidos() {
		clickPorTexto("Pedidos", "Click em pedidos");
		
	}

	public void clickConfigurações() {
		clickPorTexto("Configurações", "Click em configurações");
	}

	public void clickSincornismo() {
		clickPorTexto("", "");
	}

}
