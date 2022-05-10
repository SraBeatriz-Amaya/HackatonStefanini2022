package pageObjects;

import static utils.Utils.*;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage{


    //BasePage
    public void acionarAbaAdmin(){
        abaAdmin.click();
    }
    //Actions
    public void acessarMenuCustomField(){
        Actions acao = new Actions(driver);

        acao.moveToElement(abaPim).build().perform();
        acao.moveToElement(menuConfiguration).build().perform();
        acao.moveToElement(menuField).click().build().perform();
    }

    //Elements
    @FindBy(id = "btnAdd")
    public WebElement botaoAdd;

    public void acionarBotaoAdd(){
        botaoAdd.click();
    }
}
