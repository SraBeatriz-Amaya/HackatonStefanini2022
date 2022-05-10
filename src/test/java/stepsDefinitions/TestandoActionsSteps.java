package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

public class TestandoActionsSteps {

    @Quando("acionar o submenu customField")
    public void acionarOSubmenuCustomField() {
        Na(TelaInicialPage.class).acessarMenuCustomField();
    }

    @Entao("o sistema apresenta a tela customField")
    public void oSistemaApresentaATelaCustomField() {
        assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
    }
}
