package br.com.automacao.permix.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.automacao.premix.Leads.test.ValidacaoCampoCargoRevendedor;
import br.com.automacao.premix.Leads.test.ValidacaoCampoStatusRevendedor;

@RunWith(Suite.class)
@SuiteClasses({ValidacaoCampoStatusRevendedor.class, ValidacaoCampoCargoRevendedor.class})

public class SuiteRevendedorCamposLead {

	
}
