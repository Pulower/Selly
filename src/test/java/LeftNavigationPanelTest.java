import Pages.LeftMenu;
import Pages.LeftNavigationPanelPage;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeftNavigationPanelTest extends TestBase {

    @BeforeTest
    public void acceptCookies(){
        LeftNavigationPanelPage leftPanel = new LeftNavigationPanelPage(driver);
        leftPanel.acceptCookies();
    }

    @Test(dataProvider = "LeftPanelProvider")
    public void leftNavigationPanelTest(LeftMenu menuItem, String pageTitle) {
        LeftNavigationPanelPage leftPanel = new LeftNavigationPanelPage(driver);
        leftPanel.navigateTo(menuItem);
        Assert.assertEquals(driver.getTitle(), pageTitle);
        if (leftPanel.isInPromotion()) {
            leftPanel.clickPromotions();
            Assert.assertEquals(driver.getTitle(), pageTitle + ". Promocje");
        }
        if (leftPanel.isBestseller()) {
            leftPanel.clickBestsellers();
            Assert.assertEquals(driver.getTitle(), pageTitle + ". Bestsellery");
        }
        if (leftPanel.isNew()) {
            leftPanel.clickNews();
            Assert.assertEquals(driver.getTitle(), pageTitle + ". Nowości");
        }
    }

    @DataProvider(name = "LeftPanelProvider")
    public Object[][] getLeftPanelItems() {
        return new Object[][]{
                {LeftMenu.SKLEP_RTV, "Sklep RTV - telewizory"},
                {LeftMenu.LCD, "Telewizory LCD"},
                {LeftMenu.LED, "Telewizory LED"},
                {LeftMenu.TV3D, "Telewizory 3D"},
                {LeftMenu.DVD, "Odtwarzacze DVD"},
                {LeftMenu.RTV, "Akcesoria RTV"},
                {LeftMenu.SKLEP_AGD, "Sklep AGD"},
                {LeftMenu.ZABAWKI, "Sklep z zabawkami"},
                {LeftMenu.MILITARIA, "Sklep militaria"},
                {LeftMenu.WIATROWKI, "Wiatrówki"},
                {LeftMenu.WIATROWKI_KARABINKI, "Wiatrówki karabinki"},
                {LeftMenu.WIATROWKI_PISTOLETY, "Wiatrówki pistolety"},
                {LeftMenu.AKCESORIA, "Akcesoria do wiatrówek"},
                {LeftMenu.CELOWNIKI, "Celowniki"},
                {LeftMenu.SRUT, "Śruty"},
                {LeftMenu.C02, "Naboje CO2"},
                {LeftMenu.TARCZE, "Tarcze"},
                {LeftMenu.AIRSOFTGUN, "Air Soft Gun"},
                {LeftMenu.PAINTBALL, "Paintball"},
                {LeftMenu.FOTOGRAFIA, "Fotografia"},
                {LeftMenu.APARATY, "Aparaty cyfrowe"},
                {LeftMenu.APARATY_KOMPAKTOWE, "Aparaty kompaktowe"},
                {LeftMenu.LUSTRZANKI, "Lustrzanki cyfrowe"},
                {LeftMenu.OBIEKTYWY, "Obiektywy"},
                {LeftMenu.KARTY_PAMIECI, "Karty pamięci"},
                {LeftMenu.LAMPY_BLYSKOWE, "Lampy błyskowe"},
                {LeftMenu.ALBUMY, "Książki - albumy"},
                {LeftMenu.ENCYKLOPEDIE, "Książki - encyklopedie"},
                {LeftMenu.DLA_DZIECI, "Książki - dla dzieci"},
                {LeftMenu.BIOGRAFIE, "Książki - biografie"},
                {LeftMenu.INFORMATYKA, "Książki - informatyka"},
                {LeftMenu.ZESTAWY, "Zestawy produktów"},
                {LeftMenu.DLA_PELNOLETNICH, "Kategoria dla dorosłych"},
                {LeftMenu.ZAAWANSOWANE_FILTRY, "Kategorie z zaawansowanymi filtrami produktów"},
                {LeftMenu.CHECKBOX, "Filtry typu checkbox"},
                {LeftMenu.SLOWNIKI, "Filtry typu słownik"},
                {LeftMenu.WARTOSC, "Filtry typu wartość"},
                {LeftMenu.ZAKRES, "Filtry typu zakres"},
                {LeftMenu.WG_WYMIAROW, "Produkty sprzedawane wg wymiarów"},
                {LeftMenu.Z_WARIANTAMI, "Produkty z wariantami"},
                {LeftMenu.NIESTANDARDOWE, "Produkty niestandardowe"},
                {LeftMenu.EBOOKI_AUDIOBOOKI, "Ebooki i audiobooki"},
                {LeftMenu.EBOOKI, "ebooki"},
                {LeftMenu.AUDIOBOOKI, "Ebooki i audiobooki"},
                {LeftMenu.ZAMOW_SKLEP_INTERNETOWY, "Zamów sklep internetowy"},
        };
    }
}

