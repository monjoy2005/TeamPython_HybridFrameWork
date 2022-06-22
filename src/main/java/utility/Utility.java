package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

public class Utility {

    public static String currentDir = System.getProperty("user.dir");

    public static Properties loadProperties(){
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(currentDir + "/config.properties");
            properties.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String decode(String key){
        byte[] decodedBytes = Base64.getDecoder().decode(key);
        return new String(decodedBytes);
    }

//    public static void main(String[] args) {
//        String originalInput = "FvsF1yqkzCozyYc5K9QM";
//        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
//        System.out.println(encodedString);

//        byte[] decodedBytes = Base64.getDecoder().decode("bmFjZXJoYWRqc2FpZDE=");
//        String decodedString = new String(decodedBytes);
//        System.out.println(decodedString);
//   }

    }