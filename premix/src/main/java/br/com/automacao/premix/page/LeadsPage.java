package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class LeadsPage extends BasePage{
	public void validaNome(String esperado){
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_name_label_lead"), "Get Campo Nome");
		validacao(esperado, recebido, "Validação da existencia Campo Nome");
	}
	public void validaEmpresa(String esperado){
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_company_label_lead"), "Get Campo Empresa");
		validacao(esperado, recebido, "Validação da existencia Campo Empresa");
	}
	
	public void validaCelular(String esperado){
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_mobile_phone_label_lead"), "Get Campo Celular");
		validacao(esperado, recebido, "Validação da existencia Campo Celular");
	}
	
	public void validaStatus(String esperado){
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_status_label_lead"), "Get Campo Status");
		validacao(esperado, recebido, "Validação da existencia Campo Status");
	}
	
	public void validaTipoDeRegistro(String esperado){
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_record_type_label_lead"), "Get Campo Tipo de registro");
		validacao(esperado, recebido, "Validação da existencia Campo Tipo de registro");
	}
}
