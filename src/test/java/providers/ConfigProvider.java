package providers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProvider {

    private static Properties properties = new Properties();
    private static InputStream input = null;

    public static String getBrowser() throws IOException {
        getInput();
        return properties.getProperty("browser");
    }
    public static String getURL() throws IOException {
        getInput();
        return properties.getProperty("URL");
    }
    private static void getInput() throws IOException {
        input = new FileInputStream("dataConfiguration.properties");
        properties.load(input);
    }
}
