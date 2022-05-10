package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {
    @Quando("eu acionar a aba admin")
    public void euAcionarAAbaAdmin() {
        Na(TelaInicialPage.class).acionarAbaAdmin();
    }

    @Quando("acionar o botao add")
    public void acionarOBotaoAdd() {
        Na(TelaInicialPage.class).acionarBotaoAdd();
    }

    @Quando("informar o campo employer name {string}")
    public void informarOCampoEmployerName(String employerName) {
        Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
    }

    @Quando("informar o campo username {string}")
    public void informarOCampoUsername(String userName) {
        Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
    }

    @Quando("informar o campo password {string}")
    public void informarOCampoPassword(String senha) {
        Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
    }

    @Quando("informar no campo confirmar password {string}")
    public void informarNoCampoConfirmarPassword(String senha) {
        Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
    }

    @Quando("clicar no botao save")
    public void clicarNoBotaoSave() {
        Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
    }

    @Entao("o sistema cadastra o usuario {string}")
    public void oSistemaCadastraOUsuario(String userName) throws Throwable {
        assertTrue(driver.findElement(By.xpath("//a[text()='"+userName+"']")).isDisplayed());
    }

}
