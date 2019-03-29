package br.com.automacao.premix.Leads.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;


public class ValidacaoCampos extends BaseTest {
	private InicioPage inicio = new InicioPage();
	private DrawerPage drawer = new DrawerPage();
	private LeadsPage lead = new LeadsPage();
	
	@Test
	public void validacaoCampos(){
		statusReport("Leads", "Validar Campos");
		inicio.clickBtnDrawer();
		drawer.clickLeads();
		lead.validaNome("Nome");
		lead.validaEmpresa("Empresa");
		lead.validaCelular("Celular");
		lead.validaStatus("Status");
		lead.validaTipoDeRegistro("Tipo de Registro");
	}
	
	

}
