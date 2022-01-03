package pages;

import hooks.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By tittleM = By.id("id_gender1");
    private By tittleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By select_state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");

    private By submit_button = By.id("submitAccount");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type) {
        waitElementBePresent(tittleM, 20);
        if (type == 1) {
            driver.findElement(tittleM).click();
        } else {
            driver.findElement(tittleF).click();
        }
    }

    public void preencherName(String name) {
        driver.findElement(first_name_field).sendKeys(name);
    }

    public void preencherLastname(String lastname) {
        driver.findElement(last_name_field).sendKeys(lastname);
    }

    public void preencherPassword(String password) {
        driver.findElement(password_field).sendKeys(password);
    }

    public void selecioonaAniversario(Integer day, Integer months, String year) {
        Select select_day = new Select(driver.findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(driver.findElement(select_months_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(driver.findElement(select_years_field));
        select_year.selectByValue(year);
    }

    public void preencherAddress(String address) {
        driver.findElement(address_field).sendKeys(address);
    }

    public void preencherCity(String city) {
        driver.findElement(city_field).sendKeys(city);
    }

    public void preencherState(Integer state) {
        Select select_state = new Select(driver.findElement(select_state_field));
        select_state.selectByIndex(state);

    }

    public void preencherPostcode(String postcode) {
        driver.findElement(postcode_field).sendKeys(postcode);
    }

    public void preencherPhone(String phone) {
        driver.findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clickRegister() {
        driver.findElement(submit_button).click();

    }

    public void valida_cadastro(String nome, String sobrenome){
        waitElementBePresent(By.className("button-search"), 20);
        String resultado_atual = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }

}