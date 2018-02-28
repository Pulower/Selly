package Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class FirefoxDriverManager extends DriverManager {

    private GeckoDriverService fService;

    @Override
    protected void startService() {
        if (null == fService) {
            try {
                fService = new GeckoDriverService.Builder()
                        .usingDriverExecutable(new File("resources/drivers/geckodriver.exe"))
                        .usingAnyFreePort()
                        .build();
                fService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    protected void stopService() {
        if (null != fService && fService.isRunning())
            fService.stop();
    }

    @Override
    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("test-type");
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        driver = new FirefoxDriver(fService, capabilities);
    }
}