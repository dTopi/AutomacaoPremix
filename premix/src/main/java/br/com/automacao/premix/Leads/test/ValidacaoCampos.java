package br.com.automacao.premix.Leads.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class ValidacaoCampos extends BaseTest {
	private InicioPage inicio = new InicioPage();
	private DrawerPage drawer = new DrawerPage();
	@Test
	public void validacaoCampos(){
		statusReport("Validação dos campos","ValidarCampos");
		inicio.clickBtnDrawer();
		drawer.clickLeads();
		
	
	}
	
	

}
