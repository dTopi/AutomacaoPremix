package br.com.automacao.premix.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.PesquisarPage;

public class ClassTest extends BaseTest {
	private InicioPage inicio = new InicioPage();
	private DrawerPage drawer = new DrawerPage();
	private PesquisarPage pesquisar = new PesquisarPage();

	@Test
	public void primeiroTest() {

		statusReport("Report drawer com falha" , "teste funcionalidades do drawer");
		inicio.clickBtnDrawer();
		drawer.clickIncio();
		inicio.clickBtnDrawer();
		drawer.clickCompromissos();
		pesquisar.btnVoltar();
		inicio.clickBtnDrawer();
		drawer.clickTarefas();
		pesquisar.btnVoltar();
		drawer.clickContatos();

	}
	@Test
	public void segundoTeste(){
		statusReport("Report drawer" , "SegundoTEste");
		inicio.clickBtnDrawer();
		drawer.clickContatos();
		inicio.clickBtnDrawer();
		drawer.clickOportunidades();
		inicio.clickBtnDrawer();
		drawer.clickPedidos();
		inicio.clickBtnDrawer();
		drawer.clickConfigurações();
	}

}
