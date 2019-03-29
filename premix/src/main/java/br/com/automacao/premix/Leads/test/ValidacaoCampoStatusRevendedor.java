package br.com.automacao.premix.Leads.test;

import org.junit.Test;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;
import br.com.automacao.premix.page.NovoLeadPage;

public class ValidacaoCampoStatusRevendedor extends BaseTest {
	InicioPage inicio = new InicioPage();
	DrawerPage drawer = new DrawerPage();
	LeadsPage lead = new LeadsPage();
	NovoLeadPage novoLead = new NovoLeadPage();

	@Test
	public void validarCampoStatusLeadRevendedor() {
		statusReport("Lead Validação", "Validação pick list campo Status");
		inicio.clickBtnDrawer();
		drawer.clickLeads();
		lead.clickCriarLead();
		lead.clickRevendedor();
		novoLead.clickStatus();
		novoLead.validaPickList("Novo");
		novoLead.validaPickList("Trabalhando");
		novoLead.validaPickList("Qualificado");
		novoLead.validaPickList("Negociação");
		novoLead.validaPickList("Fechamento");
		novoLead.validaPickList("Sem contato");
		novoLead.validaPickList("Desqualificado");
		novoLead.validaPickList("Sem interesse");
	}
	

}
