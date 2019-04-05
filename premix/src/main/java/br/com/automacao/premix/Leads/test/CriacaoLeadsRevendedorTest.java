package br.com.automacao.premix.Leads.test;


import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.automacao.premix.core.BaseTest;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

 

@RunWith(JUnitParamsRunner.class)
public class CriacaoLeadsRevendedorTest extends BaseTest {
	@Test
	@FileParameters(value = "src/resources/revendedor.csv", mapper = CsvWithHeaderMapper.class)
	public void cricaoRevendedor(
			String status, String empresa, String nome, 
			String cargo, String celular, String email, 
			String telefone, String origem, String marcaDeNutricao,
			String cpf, String cnpj, String inscricaoEstadual,
			String qunatidadeTotalAnimais, String quantidadeFazendas,
			String tipoDeAtividade, String atividadeDaFazenda, 
			String cidadeEntrega, String ufEntrega, String bairroEntrega, 
			String cepEntrega, String roteiroEntrega, String observacaoEntrega, 
			String cidadeFrete, String nomedaIndicaao, String relacionamento){
				
			
	}
	

}
