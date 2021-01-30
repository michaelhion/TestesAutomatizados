package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionsSteps {
	@Quando("eu acionar o submenu CustomField")
	public void euAcionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema aprensenta a tela customField")
	public void oSistemaAprensentaATelaCustomField() {
	    assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//*[@id=\"customFieldListPane\"]/div[1]/h1")).getText());  
	}
}
