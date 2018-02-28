package base;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected WebDriver driver;
    private DriverManager driverManager;

    @BeforeTest
    public void setUpType(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void setUpDriver(){
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driverManager.quitDriver();
    }
}
