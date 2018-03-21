package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends WebElementManipulator {

    @FindBy(id = "llogin")
    private WebElement loginField;

    @FindBy(id = "lpassword")
    private WebElement passwordField;

    @FindBy(xpath = "//a[@class='login-header']")
    private WebElement loginPageBtn;

    @FindBy(xpath = "//input[@value='Zaloguj się']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='error error-box']")
    private WebElement wrongDataLogin;

    @FindBy(xpath = "//li[@id='logout']/a")
    private WebElement logoutBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        clickOnElement(loginPageBtn);
        return this;
    }

    public LoginPage setLogin(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLogin() {
        clickOnElement(loginBtn);
        return this;
    }

    public String getErrorMessage() {
        return wrongDataLogin.getText();
    }

    public void logout(){
        clickOnElement(logoutBtn);
    }
}
