import Pages.RegistrationPage;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import providers.ConfigProvider;

import java.io.IOException;

public class RegistrationTest extends TestBase {

    private String email = RegistrationPage.generateText();
    private String password = RegistrationPage.generateText();
    private RegistrationPage registration;

    @BeforeTest
    public void makeDriver() {
        registration = new RegistrationPage(driver);
    }

    @BeforeMethod
    public void goToRegistrationPage(){
        driver.get("https://demo.selly.pl/rejestracja.html");
    }

    @Test
    public void correctRegistrationTest() throws IOException {
        fillUnchangeableFields();
        registration.setEmail(email + "@gmail.com").
                setPassword(password, password)
                .acceptReg()
                .acceptAgreement()
                .register();
        Assert.assertEquals(driver.getTitle(), "Konto zostało utworzone");
    }

    @Test(dependsOnMethods = "correctRegistrationTest")
    public void busyEmailRegistrationTest() throws IOException {
        fillUnchangeableFields();
        registration.setEmail(email + "@gmail.com").
                setPassword(password, password)
                .acceptReg()
                .acceptAgreement()
                .register();
        Assert.assertTrue(registration.getAlert().contains("Wystąpiły błędy w formularzu"));
    }

    @Test
    public void registrationWithoutAcceptConditionsTest() throws IOException {
        fillUnchangeableFields();
        registration.setEmail(RegistrationPage.generateText() + "@gmail.com").
                setPassword(password, password)
                .register();
        Assert.assertTrue(registration.getAlert().contains("Proszę potwierdzić znajomość regulaminu"));
    }

    @Test
    public void differentPasswordsRegistrationTest() throws IOException {
        fillUnchangeableFields();
        registration.setEmail(RegistrationPage.generateText() + "@gmail.com").
                setPassword(password, password + "a")
                .acceptReg()
                .acceptAgreement()
                .register();
        Assert.assertTrue(registration.getAlert().contains("Wpisane hasła się różnią"));
    }

    private void fillUnchangeableFields() throws IOException {
        registration.setName(ConfigProvider.get("registrationName"))
                .setSurname(ConfigProvider.get("registrationSurname"))
                .setCode(ConfigProvider.get("registrationCode"))
                .setCity(ConfigProvider.get("registrationCity"))
                .setAddress(ConfigProvider.get("registrationAddress"))
                .setPhone(ConfigProvider.get("registrationPhone"));
    }
}

