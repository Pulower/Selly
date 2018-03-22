import Pages.*;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import providers.ConfigProvider;

import java.io.IOException;

public class TradeTest extends TestBase {

    private LoginPage login;
    private LeftNavigationPanelPage leftPanel;
    private TradePage trade;

    @Test
    public void tradeTest() throws IOException {
        login = new LoginPage(driver);
        leftPanel = new LeftNavigationPanelPage(driver);
        trade = new TradePage(driver);
        login.goToLoginPage()
                .setLogin(ConfigProvider.get("login"))
                .setPassword(ConfigProvider.get("password"))
                .clickLogin();
        leftPanel.navigateTo(LeftMenu.DVD);
        trade.addToCart(Products.DVDPLAYER)
                .continueShopping();
        leftPanel.navigateTo(LeftMenu.BIOGRAFIE);
        trade.addToCart(Products.DRINKSANDCOCTAILS)
                .goToShoppingCart();
        Assert.assertEquals(trade.getNumberOfProducts(), "2");
    }
}
