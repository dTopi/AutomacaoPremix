package br.com.automacao.premix.Leads.test;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;



import br.com.autmacao.premix.util.ValidacaoSync;
import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.core.DriverFactory;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;
import br.com.automacao.premix.page.NovoLeadPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class CriacaoLeadsRevendedorTest extends BaseTest {
	InicioPage inicio = new InicioPage();
	DrawerPage drawer = new DrawerPage();
	LeadsPage lead = new LeadsPage();
	NovoLeadPage novoLead = new NovoLeadPage();
	ValidacaoSync sync = new ValidacaoSync();
	
	@Test
	@FileParameters(value = "src/resources/revendedor.csv", mapper = CsvWithHeaderMapper.class)
	public void cricaoRevendedor(String status, String empresa, String nome, String cargo, String celular, String email,
			String telefone, String origem, String marcaDeNutricao,String observacao, String cpf, String cnpj, String inscricaoEstadual,
			String qunatidadeTotalAnimais, String quantidadeFazendas, String tipoDeAtividade, String atividadeDaFazenda,
			String cidadeEntrega,String bairroEntrega, String cepEntrega, String roteiroEntrega,
			String observacaoEntrega, String cidadeFrete, String nomedaIndicaao, String relacionamento) {
			  statusReport("Cadastro de Lead", "Revendedor");
			  String cidadela = "CURITIBA";
			  String cidadela2 = "CURITIBA (PR)";
			  inicio.clickBtnDrawer();
			  drawer.clickLeads();
			  lead.clickCriarLead();
			  lead.clickRevendedor();
			  novoLead.clickStatus();
			  novoLead.selectPicklistStatus(status);
			  novoLead.setCidade(cidadela);
			  novoLead.selectPicklistCidadeEntrega(cidadela2);
			  //----------------
			  //novoLead.setCidade(cidadela);
			  //novoLead.setBairroEntrega(bairroEntrega);
			  //scroll(0.2,0.1);
			  //novoLead.setCep(cepEntrega);
			  //scroll(0.2,0.1);
			  //--------------------
			  novoLead.setEmpresa(empresa);
			  novoLead.setNome(nome);
			  scroll(0.2,0.1);
			  novoLead.clickCargo();
			  novoLead.selectPickListCargo(cargo); 
			  scroll(0.3,0.1);
			  novoLead.setCelular(celular);
			  novoLead.setEmail(email);
			  scroll(0.2,0.1);
			  novoLead.setTelefone(telefone);
			  scroll(0.3,0.1);
			  novoLead.clickOrigem();
			  novoLead.selectPickListOrigem(origem);
			  scroll(0.2,0.1);
			  novoLead.setObservacao(observacao);
			  scroll(0.3,0.1);
			  novoLead.setCpf(cpf);
			  scroll(0.2,0.1);
			  novoLead.setCnpj(cnpj);
			  scroll(0.3,0.1);
			  novoLead.clickInsentoInscricaoEstadual();
			  scroll(0.2,0.1);
			  novoLead.setInscricaoEstadual(inscricaoEstadual);
			  scroll(0.3,0.1);
			  novoLead.setQuantidadeAnimais(qunatidadeTotalAnimais);
			  novoLead.setQuantidadeFazendas(quantidadeFazendas);
			  scroll(0.2,0.1);
			  novoLead.clickTipoAtividade();
			  novoLead.selectPickListTipoAtividade(tipoDeAtividade);
			  scroll(0.3,0.1);
			  novoLead.clickAtividadeDaFazenda();
			  novoLead.selectPickListAtividadeFazenda(atividadeDaFazenda);
			  scroll(0.2,0.1);
			  novoLead.setCidade(cidadeEntrega);
			  //novoLead.selectPicklistCidadeEntrega(cidadeEntrega);
			  scroll(0.3,0.1);
			  novoLead.setBairroEntrega(bairroEntrega);
			  scroll(0.2,0.1);
			  novoLead.setCep(cepEntrega);
			  scroll(0.2,0.1);
			  novoLead.setRoteiroEntrega(roteiroEntrega);
			  scroll(0.2,0.1);
			  novoLead.setObervacaoEntrega(observacaoEntrega);
			  scroll(0.2,0.1);
			  novoLead.setCidadeFrete(cidadeFrete);
			  scroll(0.2,0.1);
			  novoLead.setNomeIndicacao(nomedaIndicaao);
			  scroll(0.2,0.1);
			  novoLead.clickRelacionamento();
			  novoLead.selectPickListRelacionamento(relacionamento);
			  scroll(0.2,0.1);
			  novoLead.clickSalvarNovoLead();
			  sync.validaLeadSalvo();
			  lead.setPesquisar(empresa);
			  
	}

	

}
