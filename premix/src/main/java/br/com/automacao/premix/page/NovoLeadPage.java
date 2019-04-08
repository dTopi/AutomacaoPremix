package br.com.automacao.premix.page;

import org.openqa.selenium.By;

import br.com.automacao.premix.core.BasePage;

public class NovoLeadPage extends BasePage{
     //Click 
	public void clickStatus(){
    	  click(By.className("android.widget.EditText"), "Click Status");
      }
	
	public void clickCargo(){
		click(By.xpath("//*[@text='Cargo']"), "Click campo Cargo");
	}
	
	public void clickInsentoInscricaoEstadual() {
		click(By.id("br.com.topinformation.premix:id/tip_state_registration_exemption_lead_detail"),
				"Marca checbox Insento incrição estadual");
	}
	public void clickOrigem(){
		clickPorTexto("Origem", "Click em origem");
	}
	public void clickTipoAtividade(){
		clickPorTexto("Tipo de atividade", "Click tipo de ativadade");
	}
	public void clickAtividadeDaFazenda(){
		clickPorTexto("Atividades da fazenda", "Click Atividades da Fazenda");
	}
	public void clickRelacionamento(){
		clickPorTexto("Relacionamento", "Click Relacionamentos");
	}
	public void clickSalvarNovoLead(){
		click(By.id("br.com.topinformation.premix:id/action_save_lead"), "Click Salvar");
	}
	// ------------------------------------------------
	// pickList
		public void selectPicklistStatus(String status) {
			clickPorTexto(status, "Escolha do status");
		}

		public void selectPickListCargo(String cargo) {
			clickPorTexto(cargo, "Escolha do tipo de cargo");
		}

		public void selectPickListOrigem(String origem) {
			clickPorTexto(origem, "Escolha do tipo de origem");
		}

		public void selectPickListTipoAtividade(String tipoAtividade) {
			clickPorTexto(tipoAtividade, "Escolha do tipo de atividade");
		}

		public void selectPickListAtividadeFazenda(String atividadeFazenda) {
			clickPorTexto(atividadeFazenda, "Escolha da Atividade da Fazenda");
		}

		public void selectPicklistCidadeEntrega(String cidade) {
			clickPorTexto(cidade, "Escolha da cidade");
		}

		public void selectPickListCidadeFrete(String cidadeFrete) {
			clickPorTexto(cidadeFrete, "Escolha da cidade para frete");
		}

		public void selectPickListRelacionamento(String relacionamento) {
			clickPorTexto(relacionamento, "Escolha do relacionamento");
		}

		// -------------
		// Set
		public void setEmpresa(String empresa){
			set(By.id("br.com.topinformation.premix:id/tip_company_lead_detail"), empresa, "Set Empresa");
		}
		public void setNome(String nome){
			set(By.id("br.com.topinformation.premix:id/til_name_lead_detail"), nome, "Set Nome");
		}
		public void setCelular(String celular){
			set(By.id("br.com.topinformation.premix:id/til_mobile_phone_lead_detail"), celular, "Set Celular");
		}
		public void setEmail(String email){
        	set(By.id("br.com.topinformation.premix:id/til_email_lead_detail"), email, "Set Email");
        }
		public void setTelefone(String telefone){
			set(By.id("br.com.topinformation.premix:id/tip_phone_lead_detail"), telefone, "Set Telefone");
		}
		
		public void setCidade(String cidade) {
			set(By.id("br.com.topinformation.premix:id/til_delivery_city_lead_detail"), cidade, "Set nome da cidade");
		}
        public void setEmpresaMarcaNutricao(String empresaMarcaNutricional){
        	set(By.id("br.com.topinformation.premix:id/tip_current_nutrition_brand_lead_detail"), empresaMarcaNutricional, "Set Empresa/ Marca de nutrição atual");
        }
        public void setObservacao(String observacao){
        	set(By.id("br.com.topinformation.premix:id/tip_notes_lead_detail"), observacao, "Set Observação");
        }
        public void setCpf(String cpf){
        	set(By.id("br.com.topinformation.premix:id/til_cpf_lead_detail"), cpf, "Set CPF");
        }
        public void setCnpj(String cnpj){
        	set(By.id("br.com.topinformation.premix:id/tip_cnpj_lead_detail"), cnpj, "Set Cnpj");
        }
        public void setInscricaoEstadual(String inscricaoEstadual){
        	set(By.id("br.com.topinformation.premix:id/tip_state_registration_number_lead_detail"), inscricaoEstadual, "Set Inscriçao Estadual");
        }
        public void setQuantidadeAnimais(String quantidadeAinimais){
        	set(By.id("br.com.topinformation.premix:id/til_animals_total_amount_lead_detail"), quantidadeAinimais, "Set Quantidade de Animais");
        }
        public void setQuantidadeFazendas(String quantidadeFazendas){
        	set(By.id("br.com.topinformation.premix:id/tip_farms_amount_lead_detail"), quantidadeFazendas, "Set Quantidade de Fazendas");
        }
        
		public void setCidadeFrete(String cidadeFrete) {
			set(By.id("br.com.topinformation.premix:id/til_freight_city_lead_detail"), cidadeFrete, "Set nome da Cidade");
		}
		
		public void setBairroEntrega(String bairroEntrega){
			set(By.id("br.com.topinformation.premix:id/til_delivery_district_lead_detail"), bairroEntrega, "Set Bairro Entrega");
		}
		public void setCep(String cep){
			set(By.id("br.com.topinformation.premix:id/til_delivery_zipcode_lead_detail"), cep, "Set CEP");
		}
		public void setRoteiroEntrega(String roteiroEntrega){
			set(By.id("br.com.topinformation.premix:id/til_delivery_itinerary_lead_detail"), roteiroEntrega, "Set Roteiro Entrega");
		}
		public void setObervacaoEntrega(String observacaoEntrega){
			set(By.id("br.com.topinformation.premix:id/tip_delivery_notes_lead_detail"), observacaoEntrega, "Set Observação Entrega");
		}
		public void setNomeIndicacao(String nomeIndicacao){
			set(By.id("br.com.topinformation.premix:id/til_indication_name_lead_detail"), nomeIndicacao, "Set nome da Indicação");
		}
		// -----------------
		//Validações
		public void validaPickList(String esperado){
    	String recebido = get(By.xpath("//*[@text='" + esperado + "']"), "Get" + esperado);
    	validacao(esperado, recebido, "Valida existencia" + recebido);
    }
	
}
