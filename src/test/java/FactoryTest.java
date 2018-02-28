import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryTest {

    private DriverManager driverManager;
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://demo.selly.pl/");
        Assert.assertEquals("Sklep DEMO - przykładowy sklep internetowy Selly", driver.getTitle());
    }

    @Test
    public void launchGoogleTes2t() {
        driver.get("https://demo.selly.pl/");
        Assert.assertEquals("Sklep DEMO - przykładowy sklep internetowy Selly", driver.getTitle());
    }
}
