package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class LeadsPage extends BasePage {
	// Click
	public void clickCriarLead() {
		click(By.className("android.widget.ImageButton"), "Click em adicionar novo lead");
	}

	public void clickRevendedor() {
		click(By.id("br.com.topinformation.premix:id/fab_reseller_lead"), "Click Revendedor");
	}

	public void clickProdutorRural() {
		click(By.id("br.com.topinformation.premix:id/fab_rural_producer_lead"), "Click Produtor Rural");
	}

	public void clickOutroForaDaPecuaria() {
		click(By.id("br.com.topinformation.premix:id/fab_others_lead"), "click Outro Fora da Pecuaria");
	}

	public void clickConsumidorFinal() {
		click(By.id("br.com.topinformation.premix:id/fab_final_consumer_lead"), "Click Consumidor final");
	}

	public void clickAssoc_Inst_DeEnsino() {
		click(By.id("br.com.topinformation.premix:id/fab_associated_educational_institution_lead"),
				"Click Assoc./Inst. de Ensino");
	}

	
	//Set
	public void setPesquisar(String nome){
		set(By.id("br.com.topinformation.premix:id/search_bar_text"), nome, "Pesquisar o registro recem criado");
	}
	
	// Validações
	public void validaNome(String esperado) {
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_name_label_lead"), "Get Campo Nome");
		validacao(esperado, recebido, "Validação da existencia Campo Nome");
	}

	public void validaEmpresa(String esperado) {
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_company_label_lead"), "Get Campo Empresa");
		validacao(esperado, recebido, "Validação da existencia Campo Empresa");
	}

	public void validaCelular(String esperado) {
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_mobile_phone_label_lead"), "Get Campo Celular");
		validacao(esperado, recebido, "Validação da existencia Campo Celular");
	}

	public void validaStatus(String esperado) {
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_status_label_lead"), "Get Campo Status");
		validacao(esperado, recebido, "Validação da existencia Campo Status");
	}

	public void validaTipoDeRegistro(String esperado) {
		String recebido = get(By.id("br.com.topinformation.premix:id/tv_record_type_label_lead"),
				"Get Campo Tipo de registro");
		validacao(esperado, recebido, "Validação da existencia Campo Tipo de registro");
	}
}
