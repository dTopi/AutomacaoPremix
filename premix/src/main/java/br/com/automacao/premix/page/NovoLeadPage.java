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
	
	//Validações
    public void validaPickList(String esperado){
    	String recebido = get(By.xpath("//*[@text='" + esperado + "']"), "Get" + esperado);
    	validacao(esperado, recebido, "Valida existencia" + recebido);
    }
	
}
