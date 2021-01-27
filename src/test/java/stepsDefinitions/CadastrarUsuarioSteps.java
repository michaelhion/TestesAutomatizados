package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {
	
	@Quando("acionar a aba admin")
	public void acionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar o campo employee name {string}")
	public void informarOCampoEmployeeName(String employerName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
	}

	@Quando("informar o campo username {string}")
	public void informarOCampoUsername(String userName) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}

	@Quando("informar o campo password {string}")
	public void informarOCampoPassword(String password) {
	    Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
	}

	@Quando("informar o campo confirmar password {string}")
	public void informarOCampoConfirmarPassword(String password) {
	    Na(CadastrarUsuarioPage.class).informarConfirmPassword(password);
	}

	@Quando("clicar no botao save")
	public void clicarNoBotaoSave() {
	    Na(CadastrarUsuarioPage.class).acionarBotaoSave();
	}

	@Entao("^o sistema cadastra usuario \"([^\"]*)\"$")
	public void oSistemaCadastraUsuario(String usuario) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='"+usuario+"']")).isDisplayed());
	}
}
