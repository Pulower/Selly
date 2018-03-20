package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigationPanelPage extends WebElementManipulator {

    public LeftNavigationPanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'promocje')]")
    private WebElement promotions;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'bestsellery')]")
    private WebElement bestsellers;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'nowosci')]")
    private WebElement news;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'sklep-rtv')]")
    private WebElement rtvShop;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'lcd')]")
    private WebElement lcdTv;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'led')]")
    private WebElement ledTv;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, '3d')]")
    private WebElement tv3d;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'dvd')]")
    private WebElement dvd;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'akcesoria-rtv')]")
    private WebElement rtv;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'agd')]")
    private WebElement agdShop;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'sklep-z-zabawkami')]")
    private WebElement toysShop;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'sklep-militaria')]")
    private WebElement militaryShop;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'wiatrowki,c7.html')]")
    private WebElement airguns;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'karabinki')]")
    private WebElement airgunsRifle;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'pistolety')]")
    private WebElement airgunsPistol;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'akcesoria-do-wiatrowek')]")
    private WebElement airgunsAccesory;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'celowniki')]")
    private WebElement scopes;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'sruty')]")
    private WebElement shot;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'co2')]")
    private WebElement co2;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'tarcze')]")
    private WebElement shields;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'air-soft-gun')]")
    private WebElement asg;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'paintball')]")
    private WebElement paintball;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'fotografia')]")
    private WebElement photography;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'cyfrowe')]")
    private WebElement cameras;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'kompaktowe')]")
    private WebElement compactCameras;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'lustrzanki')]")
    private WebElement reflexCameras;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'obiektywy')]")
    private WebElement objectives;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'karty-pamieci')]")
    private WebElement memoryCards;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'lampy-blyskowe')]")
    private WebElement flasLamps;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'albumy')]")
    private WebElement albums;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'encyklopedie')]")
    private WebElement encyclopedias;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'dla-dzieci')]")
    private WebElement kids;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'biografie')]")
    private WebElement biography;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'informatyka')]")
    private WebElement it;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'zestawy')]")
    private WebElement sets;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'dla-pelnoletnich')]")
    private WebElement adults;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'z-zaawansowanymi-filtrami')]")
    private WebElement advanced;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'checkbox')]")
    private WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'slownik')]")
    private WebElement dictionary;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'wartosc')]")
    private WebElement value;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'zakres')]")
    private WebElement range;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'wg-wymiarow')]")
    private WebElement dimensions;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'z-wariantami')]")
    private WebElement variants;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'niestandardowe')]")
    private WebElement custom;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'ebooki-i-audiobooki')]")
    private WebElement ebooksAndAudiobooks;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'ebooki,')]")
    private WebElement ebooks;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'audiobooki,')]")
    private WebElement audiobooks;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/descendant::a[contains(@href, 'zamow-sklep')]")
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

    public void clickPromotions() {
        clickOnElement(promotions);
    }

    public void clickBestsellers() {
        clickOnElement(bestsellers);
    }

    public void clickNews() {
        clickOnElement(news);
    }
}
