package br.com.automacao.premix.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.PesquisarPage;

public class TestEmulador extends BaseTest {
	private InicioPage inicio = new InicioPage();
	private DrawerPage drawer = new DrawerPage();
	private PesquisarPage pesquisar = new PesquisarPage();

	@Test
	public void primeiroTesteEmulator(){
		statusReport("Emulator" , "testando emulador");
		drawer.clickIncio();
		drawer.clickCompromissos();
		pesquisar.btnVoltar();
		inicio.clickBtnDrawer();
		drawer.clickTarefas();
		pesquisar.btnVoltar();
		drawer.clickContatos();
		
	}

}
