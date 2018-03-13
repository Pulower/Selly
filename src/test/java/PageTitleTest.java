import Pages.SellyHomePage;
import Pages.TopMenu;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PageTitleTest extends TestBase {

    @DataProvider(name = "TopMenuProvider")
    public Object[][] getMenuItems() {
        return new Object[][]{
                {TopMenu.START, "Sklep DEMO - przykładowy sklep internetowy Selly"},
                {TopMenu.OFIRMIE, "O firmie"},
                {TopMenu.AKTUALNOSCI, "Aktualności"},
                {TopMenu.BLOG, "Blog Sklep DEMO Selly"},
                {TopMenu.KONTAKT, "Kontakt"}
        };
    }

    @Test(dataProvider = "TopMenuProvider")
    public void pageTitleCheck(TopMenu menuItem, String pageTitle) {
        SellyHomePage sellyHomePage = new SellyHomePage(driver);
        sellyHomePage.navigateTo(menuItem);
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }
}
