import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod(){
        driverManager.quitDriver();
    }

    @Test
    public void test1(){
        driver.get("http://google.pl");
    }
}
