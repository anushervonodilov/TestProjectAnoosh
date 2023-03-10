package com.class32;

import com.utils.ExcelReader;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExcelDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read();

        for (Map<String, String> row : excelData) {
            for (var entry : row.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("**************************");
        }

    }
}
