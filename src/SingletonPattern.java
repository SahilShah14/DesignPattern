import java.util.Map;
import java.util.HashMap;

// Singleton class
class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configMap = new HashMap<>();

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        configMap.put(key, value);
    }

    public String getConfig(String key) {
        return configMap.get(key);
    }
}

// Main class
public class SingletonPattern {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        config1.setConfig("host", "localhost");

        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println(config2.getConfig("host")); // Output: localhost
    }
}
