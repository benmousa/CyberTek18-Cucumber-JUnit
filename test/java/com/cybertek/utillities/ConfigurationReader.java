package com.cybertek.utillities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {
        String path = "C:\\Users\\BENMOUSA\\IdeaProjects\\SeleniumProjectB18\\configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            System.out.println("Properties file NOT found");
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
