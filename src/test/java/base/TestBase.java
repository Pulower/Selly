package base;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestBase {

    protected WebDriver driver;
    private String address = "https://demo.selly.pl/";
    private DriverManager driverManager;
    private static int screenId = 0;

    private static void printBrowserLogs(WebDriver driver){
        System.out.println("Browser logs");
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for(LogEntry entry : logEntries){
            System.out.println("Timestamp: " + new Date(entry.getTimestamp()) +
                    "\nLevel: " + entry.getLevel() +
                    "\nMessage: " + entry.getMessage());
        }
    }

    private void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("resources/screenshots/" + Integer.toString(screenId) + ".jpg"));
        screenId++;
    }

    @BeforeTest
    public void setUpDriver(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(address);
    }

    @AfterTest
    public void tearDown() throws IOException {
        takeScreenshot();
        printBrowserLogs(driver);
        driverManager.quitDriver();
    }
}
