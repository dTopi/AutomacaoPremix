package br.com.automacao.premix.Leads.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.automacao.premix.core.BaseTest;
import br.com.automacao.premix.page.DrawerPage;
import br.com.automacao.premix.page.InicioPage;
import br.com.automacao.premix.page.LeadsPage;
import br.com.automacao.premix.page.NovoLeadPage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class CriacaoLeadsRevendedorTest extends BaseTest {
	InicioPage inicio = new InicioPage();
	DrawerPage drawer = new DrawerPage();
	LeadsPage lead = new LeadsPage();
	NovoLeadPage novoLead = new NovoLeadPage();
	
	@Test
	@FileParameters(value = "src/resources/revendedor.csv", mapper = CsvWithHeaderMapper.class)
	public void cricaoRevendedor(String status, String empresa, String nome, String cargo, String celular, String email,
			String telefone, String origem, String observacao, String marcaDeNutricao, String cpf, String cnpj, String inscricaoEstadual,
			String qunatidadeTotalAnimais, String quantidadeFazendas, String tipoDeAtividade, String atividadeDaFazenda,
			String cidadeEntrega, String ufEntrega, String bairroEntrega, String cepEntrega, String roteiroEntrega,
			String observacaoEntrega, String cidadeFrete, String nomedaIndicaao, String relacionamento) {
			
			  inicio.clickBtnDrawer();
			  drawer.clickLeads();
			  lead.clickCriarLead();
			  lead.clickRevendedor();
			  novoLead.clickStatus();
			  novoLead.selectPicklistStatus(status);
			  novoLead.setEmpresa(empresa);
			  novoLead.setNome(nome);
			  novoLead.clickCargo();
			  novoLead.selectPickListCargo(cargo);
			  novoLead.setCelular(celular);
			  novoLead.setEmail(email);
			  novoLead.setTelefone(telefone);
			  novoLead.clickOrigem();
			  novoLead.selectPickListOrigem(origem);
			  novoLead.setObservacao(observacao);
			  novoLead.setCpf(cpf);
			  novoLead.setCnpj(cnpj);
			  novoLead.clickInsentoInscricaoEstadual();
			  novoLead.setInscricaoEstadual(inscricaoEstadual);
			  novoLead.setQuantidadeAnimais(qunatidadeTotalAnimais);
			  novoLead.setQuantidadeFazendas(quantidadeFazendas);
			  novoLead.clickTipoAtividade();
			  novoLead.selectPickListTipoAtividade(tipoDeAtividade);
			  novoLead.clickAtividadeDaFazenda();
			  novoLead.selectPickListAtividadeFazenda(atividadeDaFazenda);
			  novoLead.setCidade(cidadeEntrega);
			  novoLead.selectPicklistCidadeEntrega(cidadeEntrega);
			  novoLead.setBairroEntrega(bairroEntrega);
			  novoLead.setCep(cepEntrega);
			  novoLead.setRoteiroEntrega(roteiroEntrega);
			  novoLead.setObervacaoEntrega(observacaoEntrega);
			  novoLead.setCidadeFrete(cidadeFrete);
			  novoLead.setNomeIndicacao(nomedaIndicaao);
			  novoLead.clickRelacionamento();
			  novoLead.selectPickListRelacionamento(relacionamento);
	}

}
