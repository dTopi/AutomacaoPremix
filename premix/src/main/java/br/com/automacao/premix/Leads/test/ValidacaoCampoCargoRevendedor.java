package br.com.automacao.premix.Leads.test;

import org.junit.Test;

import br.com.automacao.premix.core.BasePage;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;
import br.com.automacao.premix.page.NovoLeadPage;

public class ValidacaoCampoCargoRevendedor extends BasePage{
	InicioPage inicio = new InicioPage();
	DrawerPage drawer = new DrawerPage();
	LeadsPage lead = new LeadsPage();
	NovoLeadPage novoLead = new NovoLeadPage();
	@Test
	public void validarCampoCargo(){
		statusReport("Lead Validação", "Validação pick list Campo Cargo");
		inicio.clickBtnDrawer();
		drawer.clickLeads();
		lead.clickCriarLead();
		lead.clickRevendedor();
		novoLead.clickCargo();
		novoLead.validaPickList("Administrador");
		novoLead.validaPickList("Comprador");
		novoLead.validaPickList("Gerente da Fazenda");
		novoLead.validaPickList("Peão");
		novoLead.validaPickList("Proprietário");
		novoLead.validaPickList("Técnico");
		novoLead.validaPickList("Veterinário");
		novoLead.validaPickList("Capataz");
		novoLead.validaPickList("Vaqueiro");
		novoLead.validaPickList("Zootecnista");
	}
}
