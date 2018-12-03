package br.com.automacao.premix.core;

import org.junit.After;

public class BaseTest {
	
	@After
	public void FinalizaApp(){
		DriverFactory.getDriver().resetApp();
	}

}
