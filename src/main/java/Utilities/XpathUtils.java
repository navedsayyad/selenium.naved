package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class XpathUtils {

    public static String getXpath(String key){

        try {
            File file = new File("src/main/resources/xpath.properties");
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
