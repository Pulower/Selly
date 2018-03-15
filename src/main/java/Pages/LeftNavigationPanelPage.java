package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigationPanelPage extends WebElementManipulator {

    public LeftNavigationPanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(partialLinkText = "Promocje")
    private WebElement promotions;

    @FindBy(partialLinkText = "Bestsellery")
    private WebElement bestsellers;

    @FindBy(partialLinkText = "Nowości")
    private WebElement news;

    @FindBy(xpath = "//a[@class='close btn color1']")
    private WebElement cookies;

    @FindBy(partialLinkText = "Sklep RTV")
    private WebElement rtvShop;

    @FindBy(partialLinkText = "Telewizory LCD")
    private WebElement lcdTv;

    @FindBy(partialLinkText = "Telewizory LED")
    private WebElement ledTv;

    @FindBy(partialLinkText = "Telewizory 3D")
    private WebElement tv3d;

    @FindBy(partialLinkText = "Odtwarzacze DVD")
    private WebElement dvd;

    @FindBy(partialLinkText = "Akcesoria RTV")
    private WebElement rtv;

    @FindBy(partialLinkText = "Sklep AGD")
    private WebElement agdShop;

    @FindBy(partialLinkText = "Sklep z zabawkami")
    private WebElement toysShop;

    @FindBy(partialLinkText = "Sklep militaria")
    private WebElement militaryShop;

    @FindBy(partialLinkText = "Wiatrówki")
    private WebElement airguns;

    @FindBy(partialLinkText = "Wiatrówki karabinki")
    private WebElement airgunsRifle;

    @FindBy(partialLinkText = "Wiatrówki pistolety")
    private WebElement airgunsPistol;

    @FindBy(partialLinkText = "Akcesoria do wiatrówek")
    private WebElement airgunsAccesory;

    @FindBy(partialLinkText = "Celowniki")
    private WebElement scopes;

    @FindBy(partialLinkText = "Śruty")
    private WebElement shot;

    @FindBy(partialLinkText = "Naboje CO2")
    private WebElement co2;

    @FindBy(partialLinkText = "Tarcze")
    private WebElement shields;

    @FindBy(partialLinkText = "Air Soft Gun")
    private WebElement asg;

    @FindBy(partialLinkText = "Paintball")
    private WebElement paintball;

    @FindBy(partialLinkText = "Fotografia")
    private WebElement photography;

    @FindBy(partialLinkText = "Aparaty cyfrowe")
    private WebElement cameras;

    @FindBy(partialLinkText = "Aparaty kompaktowe")
    private WebElement compactCameras;

    @FindBy(partialLinkText = "Lustrzanki cyfrowe")
    private WebElement reflexCameras;

    @FindBy(partialLinkText = "Obiektywy")
    private WebElement objectives;

    @FindBy(partialLinkText = "Karty pamięci")
    private WebElement memoryCards;

    @FindBy(partialLinkText = "Lampy błyskowe")
    private WebElement flasLamps;

    @FindBy(partialLinkText = "albumy")
    private WebElement albums;

    @FindBy(partialLinkText = "encyklopedie")
    private WebElement encyclopedias;

    @FindBy(partialLinkText = "dla dzieci")
    private WebElement kids;

    @FindBy(partialLinkText = "biografie")
    private WebElement biography;

    @FindBy(partialLinkText = "informatyka")
    private WebElement it;

    @FindBy(partialLinkText = "Zestawy produktów")
    private WebElement sets;

    @FindBy(partialLinkText = "dla pełnoletnich")
    private WebElement adults;

    @FindBy(partialLinkText = "z zaawansowanymi filtrami")
    private WebElement advanced;

    @FindBy(partialLinkText = "checkbox")
    private WebElement checkbox;

    @FindBy(partialLinkText = "słownik")
    private WebElement dictionary;

    @FindBy(partialLinkText = "wartość")
    private WebElement value;

    @FindBy(partialLinkText = "zakres")
    private WebElement range;

    @FindBy(partialLinkText = "wg wymiarów")
    private WebElement dimensions;

    @FindBy(partialLinkText = "Produkty z wariantami")
    private WebElement variants;

    @FindBy(partialLinkText = "Produkty niestandardowe")
    private WebElement custom;

    @FindBy(partialLinkText = "Ebooki i audiobooki")
    private WebElement ebooksAndAudiobooks;

    @FindBy(partialLinkText = "ebooki")
    private WebElement ebooks;

    @FindBy(partialLinkText = "audiobooki")
    private WebElement audiobooks;

    @FindBy(partialLinkText = "Zamów sklep internetowy")
    private WebElement internetShop;


    public LeftNavigationPanelPage navigateTo(LeftMenu menuItem) {
        switch (menuItem) {
            case SKLEP_RTV: {
                clickOnElement(rtvShop);
                break;
            }
            case LCD: {
                clickOnElement(lcdTv);
                break;
            }
            case LED: {
                clickOnElement(ledTv);
                break;
            }
            case TV3D: {
                clickOnElement(tv3d);
                break;
            }
            case DVD: {
                clickOnElement(dvd);
                break;
            }
            case RTV: {
                clickOnElement(rtv);
                break;
            }
            case SKLEP_AGD: {
                clickOnElement(agdShop);
                break;
            }
            case ZABAWKI: {
                clickOnElement(toysShop);
                break;
            }
            case MILITARIA: {
                clickOnElement(militaryShop);
                break;
            }
            case WIATROWKI: {
                clickOnElement(airguns);
                break;
            }
            case WIATROWKI_KARABINKI: {
                clickOnElement(airgunsRifle);
                break;
            }
            case WIATROWKI_PISTOLETY: {
                clickOnElement(airgunsPistol);
                break;
            }
            case AKCESORIA: {
                clickOnElement(airgunsAccesory);
                break;
            }
            case CELOWNIKI: {
                clickOnElement(scopes);
                break;
            }
            case SRUT: {
                clickOnElement(shot);
                break;
            }
            case C02: {
                clickOnElement(co2);
                break;
            }
            case TARCZE: {
                clickOnElement(shields);
                break;
            }
            case AIRSOFTGUN: {
                clickOnElement(asg);
                break;
            }
            case PAINTBALL: {
                clickOnElement(paintball);
                break;
            }
            case FOTOGRAFIA: {
                clickOnElement(photography);
                break;
            }
            case APARATY: {
                clickOnElement(cameras);
                break;
            }
            case APARATY_KOMPAKTOWE: {
                clickOnElement(compactCameras);
                break;
            }
            case LUSTRZANKI: {
                clickOnElement(reflexCameras);
                break;
            }
            case OBIEKTYWY: {
                clickOnElement(objectives);
                break;
            }
            case KARTY_PAMIECI: {
                clickOnElement(memoryCards);
                break;
            }
            case LAMPY_BLYSKOWE: {
                clickOnElement(flasLamps);
                break;
            }
            case ALBUMY: {
                clickOnElement(albums);
                break;
            }
            case ENCYKLOPEDIE: {
                clickOnElement(encyclopedias);
                break;
            }
            case DLA_DZIECI: {
                clickOnElement(kids);
                break;
            }
            case BIOGRAFIE: {
                clickOnElement(biography);
                break;
            }
            case INFORMATYKA: {
                clickOnElement(it);
                break;
            }
            case ZESTAWY: {
                clickOnElement(sets);
                break;
            }
            case DLA_PELNOLETNICH: {
                clickOnElement(adults);
                break;
            }
            case ZAAWANSOWANE_FILTRY: {
                clickOnElement(advanced);
                break;
            }
            case CHECKBOX: {
                clickOnElement(checkbox);
                break;
            }
            case SLOWNIKI: {
                clickOnElement(dictionary);
                break;
            }
            case WARTOSC: {
                clickOnElement(value);
                break;
            }
            case ZAKRES: {
                clickOnElement(range);
                break;
            }
            case WG_WYMIAROW: {
                clickOnElement(dimensions);
                break;
            }
            case Z_WARIANTAMI: {
                clickOnElement(variants);
                break;
            }
            case NIESTANDARDOWE: {
                clickOnElement(custom);
                break;
            }
            case EBOOKI_AUDIOBOOKI: {
                clickOnElement(ebooksAndAudiobooks);
                break;
            }
            case EBOOKI: {
                clickOnElement(ebooks);
                break;
            }
            case AUDIOBOOKI: {
                clickOnElement(audiobooks);
                break;
            }
            case ZAMOW_SKLEP_INTERNETOWY: {
                clickOnElement(internetShop);
                break;
            }
        }
        return this;
    }

    public void acceptCookies() {
        clickOnElement(cookies);
    }

    public boolean isInPromotion() {
        try {
            promotions.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isBestseller() {
        try {
            bestsellers.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isNew() {
        try {
            news.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void checkPromotions() {
        clickOnElement(promotions);
    }

    public void checkBestsellers() {
        clickOnElement(bestsellers);
    }

    public void checkNews() {
        clickOnElement(news);
    }
}
