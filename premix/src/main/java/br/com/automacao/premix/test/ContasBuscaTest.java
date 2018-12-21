package br.com.automacao.premix.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.ContasPage;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.PesquisarPage;

public class ContasBuscaTest extends BaseTest {
	InicioPage inicio = new InicioPage();
	PesquisarPage pesquisar = new PesquisarPage();
	DrawerPage drawer = new DrawerPage();
	ContasPage contas = new ContasPage();
	
	String razaoSocial = null;
	
	
	@Test
	public void busscaPorRazaoSocial(){
	statusReport("Teste de busca Tela Conta","Busca por Razão Social");
	inicio.clickBtnDrawer();
	drawer.clickContas();
	pesquisar.setTxtPesquisar("Paulo");
	contas.clickBtnPesquisar();
	String RazaoSocial = contas.getRazaosocial();
	contas.validarRazaoSocial(RazaoSocial);
	
	}
	
	@Test
	public void searchNomeFazenda(){
		statusReport("Teste de busca Tela Conta","Busca por Nome da Fazenda");
		inicio.clickBtnDrawer();
		drawer.clickContas();
		pesquisar.setTxtPesquisar("Vanzin");
		contas.clickBtnPesquisar();
		String NomeDaFazenda = contas.getNomeFazenda();
		contas.validarRazaoSocial(NomeDaFazenda);
		//alenquer
	}
		
	@Test
	public void searchRazaoSocialInexistente(){
		statusReport("Teste de busca Tela Conta","Busca com dados inexistentes.");
		inicio.clickBtnDrawer();
		drawer.clickContas();
		pesquisar.setTxtPesquisar("Aaa");
		contas.clickBtnPesquisar();
		contas.validarBuscaVazia();
		
	}
}
