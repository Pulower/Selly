import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementManipulator {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js = (JavascriptExecutor)driver;

    private void waitUntilElementIsClickable(WebElement element){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    private void clickOnElement(WebElement element){
        waitUntilElementIsClickable(element);
        element.click();
    }
}
