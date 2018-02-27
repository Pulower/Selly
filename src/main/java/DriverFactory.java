import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public enum  DriverFactory {
    FIREFOX, CHROME, IE;

    public static WebDriver getDriver(DriverFactory browser){
        WebDriver driver = null;
        switch (browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "E:\\IEDriver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
        return driver;
    }
}
