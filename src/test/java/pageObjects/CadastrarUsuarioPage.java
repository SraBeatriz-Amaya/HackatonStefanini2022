package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
    @FindBy(id = "systemUser_employeeName_empName")
    private WebElement campoEmployer;

    @FindBy(id = "systemUser_userName")
    private WebElement campoUsername;

    @FindBy(id = "systemUser_password")
    private WebElement campoPassword;

    @FindBy(id = "systemUser_confirmPassword")
    private WebElement campoConfirmarPassword;

    @FindBy(id = "btnSave")
    private WebElement botaoSalvar;

    public void informarCampoEmployerName(String employerName){
        campoEmployer.sendKeys(employerName);
    }
    public void informarCampoUserName(String userName){
        campoUsername.sendKeys(userName);
    }
    public void informarCampoPassword(String senha){
        campoPassword.sendKeys(senha);
    }
    public void informarCampoConfirmarPassword(String senha){
        campoConfirmarPassword.sendKeys(senha);
    }
    public void acionarBotaoSalvar(){
        botaoSalvar.click();
    }
}
