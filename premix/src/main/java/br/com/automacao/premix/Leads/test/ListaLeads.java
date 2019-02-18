package br.com.automacao.premix.Leads.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;
import br.com.automacao.premix.page.PesquisarPage;

public class ListaLeads extends BaseTest{
	private InicioPage inicio = new InicioPage();
	private DrawerPage drawer = new DrawerPage();
	private PesquisarPage pesquisar = new PesquisarPage();
	private LeadsPage leads = new LeadsPage();
	
	@Test
	public void validaListaLead(){
		statusReport("Leads", "Validação dados lista incial de leads");
		inicio.clickBtnDrawer();
		drawer.clickLeads();
		leads.validaNome("Nome");
		leads.validaEmpresa("Empresa");
		leads.validaCelular("Celular");
		leads.validaStatus("Status");
		leads.validaTipoDeRegistro("Tipo de Registro");
	}
}
