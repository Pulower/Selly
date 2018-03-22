package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradePage extends WebElementManipulator {

    @FindBy(linkText = "Odtwarzacz DVD Samsung DVD-D530")
    private WebElement dvdPlayer;

    @FindBy(className = "add-to-cart2")
    private WebElement addToCart;

    @FindBy(xpath = "//div[@class='fancybox-inner']/a[1]")
    private WebElement continueBtn;

    @FindBy(xpath = "//div[@class='fancybox-inner']/a[2]")
    private WebElement goToCart;

    @FindBy(linkText = "1000 drinków i koktajli")
    private WebElement drinksAndCoctails;

    @FindBy(xpath = "//a[@id='cart_top']/span/span")
    private WebElement numberOfProductsInCart;

    @FindBy(id = "logo")
    private WebElement logo;

    public TradePage(WebDriver driver) {
        super(driver);
    }

    public TradePage addToCart(Products product) {
        switch (product) {
            case DVDPLAYER: {
                clickOnElement(dvdPlayer);
                break;
            }
            case DRINKSANDCOCTAILS: {
                clickOnElement(drinksAndCoctails);
                break;
            }
        }
        clickOnElement(addToCart);
        return this;
    }

    public TradePage continueShopping() {
        clickOnElement(continueBtn);
        waitForVisibilityOf(logo);
        return this;
    }

    public TradePage goToShoppingCart() {
        clickOnElement(goToCart);
        return this;
    }

    public String getNumberOfProducts() {
        return numberOfProductsInCart.getText();
    }
}
