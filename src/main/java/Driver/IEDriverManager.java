package Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class IEDriverManager extends DriverManager {

    private InternetExplorerDriverService IEService;

    @Override
    protected void startService() {
        if (null == IEService) {
            try {
                IEService = new InternetExplorerDriverService.Builder()
                        .usingDriverExecutable(new File("resources/drivers/IEDriverServer.exe"))
                        .usingAnyFreePort()
                        .build();
                IEService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (null != IEService && IEService.isRunning())
            IEService.stop();
    }

    @Override
    protected void createDriver() {
        System.setProperty("webdriver.ie.driver","resources\\drivers\\IEDriverServer.exe");
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        caps.setCapability("ignoreZoomSetting", true);
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }
}