import Pages.LoginPage;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import providers.ConfigProvider;

import java.io.IOException;

public class LoginTest extends TestBase {

    private LoginPage login;

    @BeforeTest
    public void makeDriver(){
        login = new LoginPage(driver);
    }

    @Test
    public void correctLoginTest() throws IOException {
        login.goToLoginPage().
                setLogin(ConfigProvider.get("login")).
                setPassword(ConfigProvider.get("password")).
                clickLogin();
        Assert.assertTrue(driver.getPageSource().contains("Zalogowany"));
        login.logout();
    }

    @Test
    public void incorrectLoginTest() throws IOException {
        login.goToLoginPage().
                setLogin(ConfigProvider.get("incorrectLogin")).
                setPassword(ConfigProvider.get("password")).
                clickLogin();
        Assert.assertEquals(login.getErrorMessage(), "BŁĄD! Błędny e-mail lub hasło!");
    }

    @Test
    public void incorrectPasswordTest() throws IOException {
        login.goToLoginPage().
                setLogin(ConfigProvider.get("login")).
                setPassword(ConfigProvider.get("incorrectPassword")).
                clickLogin();
        Assert.assertEquals(login.getErrorMessage(), "BŁĄD! Błędny e-mail lub hasło!");
    }

}
