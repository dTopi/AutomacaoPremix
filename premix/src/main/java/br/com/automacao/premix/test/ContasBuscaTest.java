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
	statusReport("Teste de busca Tela ContaRazoSocial","Busca por Razão Social");
	inicio.clickBtnDrawer();
	drawer.clickContas();
	pesquisar.setTxtPesquisar("AAA");
	contas.clickBtnPesquisar();
	String RazaoSocial = contas.getRazaosocial();
	contas.validarResultadoBusca("Razao Social", RazaoSocial);
	
	}
	
	@Test
	public void searchNomeFazenda(){
		statusReport("Teste de busca Tela ContaNomeFazenda","Busca por Nome da Fazenda");
		inicio.clickBtnDrawer();
		drawer.clickContas();
		pesquisar.setTxtPesquisar("AAA");
		contas.clickBtnPesquisar();
		String NomeDaFazenda = contas.getNomeFazenda();
		contas.validarResultadoBusca("Nome Fazenda", NomeDaFazenda);
		//alenquer
	}
		
	@Test
	public void searchRazaoSocialInexistente(){
		statusReport("Teste de busca Tela ContaContainexistente","Busca com dados inexistentes.");
		inicio.clickBtnDrawer();
		drawer.clickContas();
		pesquisar.setTxtPesquisar("Paulo");
		contas.clickBtnPesquisar();
		contas.validarBuscaVazia();
		
	}
}
