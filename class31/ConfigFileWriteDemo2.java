package com.class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "Files/test2.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();
        properties.setProperty("Name", "Alex");
        properties.setProperty("Name", "Jake");
        properties.setProperty("Name", "Sully");
        properties.store(fileOutputStream, "New names have been added");

    }
}
