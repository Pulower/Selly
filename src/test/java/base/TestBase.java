package base;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import Pages.LeftNavigationPanelPage;
import Pages.WebElementManipulator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import providers.ConfigProvider;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBase {

    protected WebDriver driver;
    private String address = "https://demo.selly.pl/";
    private DriverManager driverManager;
    private int screenId = 0;

    private static void printBrowserLogs(WebDriver driver) throws IOException {
        if (!ConfigProvider.get("browser").equals("FIREFOX")) {
            System.out.println("Browser logs");
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            for (LogEntry entry : logEntries) {
                System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            }
        }
    }

    private void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("resources/screenshots/" + Integer.toString(screenId) + getDate() + ".jpg"));
        screenId++;
    }

    private String getDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("_dd-MM-yyyy_HH-mm-ss");
        String dateString = dateFormat.format(date);
        return dateString;
    }

    @BeforeTest
    public void setUpDriver() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(address);
        driver.manage().window().maximize();
        WebElementManipulator wem = new WebElementManipulator(driver);
        wem.acceptCookies();
    }

    @AfterTest
    public void tearDown() throws IOException {
        takeScreenshot();
        printBrowserLogs(driver);
        driverManager.quitDriver();
    }
}
