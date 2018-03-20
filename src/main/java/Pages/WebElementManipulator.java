package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementManipulator {

    @FindBy(xpath = "//a[@class='close btn color1']")
    private WebElement cookies;

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js = (JavascriptExecutor) driver;

    public WebElementManipulator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    private void waitUntilElementIsClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void clickOnElement(WebElement element) {
        waitUntilElementIsClickable(element);
        element.click();
    }

    protected void waitForVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void acceptCookies() {
        clickOnElement(cookies);
    }
}
