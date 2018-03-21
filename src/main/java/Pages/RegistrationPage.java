package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class RegistrationPage extends WebElementManipulator{

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "pass")
    private WebElement passwordField;

    @FindBy(name = "pass2")
    private WebElement password2Field;

    @FindBy(name = "imie")
    private WebElement nameField;

    @FindBy(name = "nazwisko")
    private WebElement surnameField;

    @FindBy(name = "kod")
    private WebElement codeField;

    @FindBy(name = "miasto")
    private WebElement cityField;

    @FindBy(name = "adres")
    private WebElement addressField;

    @FindBy(name = "telefon")
    private WebElement phoneField;

    @FindBy(name = "znam")
    private WebElement acceptReg;

    @FindBy(name = "zgoda")
    private WebElement agreement;

    @FindBy(xpath = "//input[@value='Zarejestruj się']")
    private WebElement registerBtn;

    public RegistrationPage(WebDriver driver)
    {
        super(driver);
    }

    public RegistrationPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage setPassword(String pass, String pass2) {
        passwordField.sendKeys(pass);
        password2Field.sendKeys(pass2);
        return this;
    }

    public RegistrationPage setName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public RegistrationPage setSurname(String surname) {
        surnameField.sendKeys(surname);
        return this;
    }

    public RegistrationPage setCode(String code) {
        codeField.sendKeys(code);
        return this;
    }

    public RegistrationPage setCity(String city) {
        cityField.sendKeys(city);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        addressField.sendKeys(address);
        return this;
    }

    public RegistrationPage setPhone(String phone) {
        phoneField.sendKeys(phone);
        return this;
    }

    public RegistrationPage acceptReg() {
        clickOnElement(acceptReg);
        return this;
    }

    public RegistrationPage acceptAgreement() {
        clickOnElement(agreement);
        return this;
    }

    public RegistrationPage register() {
        clickOnElement(registerBtn);
        return this;
    }

    public static String generateText(){
        String chars = "0123456789abcdefghijklmnoprstuwxyzABCDEFGHIJKLMNOPRSTUWXYZ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(10);
        for(int i = 0; i<10; i++){
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public String getAlert(){
        waitForAlert();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        return alertMessage;
    }
}
