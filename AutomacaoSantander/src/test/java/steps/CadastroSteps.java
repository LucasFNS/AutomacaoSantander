package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "Lucas";
    String sobrenome = "Santos";

    @Quando("^eu preencho formulário de cadastro$")
    public void eu_preencho_formulário_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencherName(nome);
        cadastroPage.preencherLastname(sobrenome);
        cadastroPage.preencherPassword("L123333&&%%");
        cadastroPage.selecioonaAniversario(31,01,"2001");
        cadastroPage.preencherAddress("Av. Paulista 118");
        cadastroPage.preencherCity("São Paulo");
        cadastroPage.preencherState(02);
        cadastroPage.preencherPostcode("99999");
        cadastroPage.preencherPhone("+55-011971284567");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clickRegister();

    }

    @Entao("^vejo cadastro realizado com sucesso")
    public void vejo_cadastro_realizado_com_sucesso() {
        cadastroPage.valida_cadastro(nome, sobrenome);

    }

}
