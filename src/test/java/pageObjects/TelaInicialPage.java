package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage{
	
	//Base page
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}

	//Elementos
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	@FindBy(name = "btnSave")
	public WebElement botaoSave;
	public void acionarBotaoSave() {
		botaoSave.click();
	}
	
}
