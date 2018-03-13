package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SellyHomePage extends WebElementManipulator {

    @FindBy(linkText = "START")
    private WebElement startBtn;

    @FindBy(linkText = "O FIRMIE")
    private WebElement aboutCompanyBtn;

    @FindBy(linkText = "AKTUALNOŚCI")
    private WebElement newsBtn;

    @FindBy(linkText = "BLOG")
    private WebElement blogBtn;

    @FindBy(linkText = "KONTAKT")
    private WebElement contactBtn;

    public SellyHomePage(WebDriver driver) {
        super(driver);
    }

    public SellyHomePage navigateTo(TopMenu menuItem) {
        switch (menuItem) {
            case START: {
                clickOnElement(startBtn);
                break;
            }
            case OFIRMIE: {
                clickOnElement(aboutCompanyBtn);
                break;
            }
            case AKTUALNOSCI: {
                clickOnElement(newsBtn);
                break;
            }
            case BLOG: {
                clickOnElement(blogBtn);
                break;
            }
            case KONTAKT: {
                clickOnElement(contactBtn);
                break;
            }
        }
        return this;
    }
}
