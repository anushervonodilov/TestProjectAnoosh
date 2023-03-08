package com.class32;

import com.utils.ExcelReader;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        try {
            ExcelReader.read();
        } catch (Exception e) {
            System.out.println(e); 
        }


    }
}
