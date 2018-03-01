package providers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProvider {

    private static Properties properties = new Properties();
    private static InputStream input = null;

    public static String get(String property) throws IOException {
        input = new FileInputStream("dataConfiguration.properties");
        properties.load(input);
        return properties.getProperty(property);
    }
}
