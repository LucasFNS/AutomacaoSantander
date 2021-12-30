package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);
    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() {
        loginPage.acessarTelaLogin();

    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarContaBotao();
    }
}
