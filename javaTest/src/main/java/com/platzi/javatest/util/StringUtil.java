package com.platzi.javatest.util;

public class StringUtil extends Exception{

    public static String repeat(String str, int times) {
        if (times < 0 ){
            throw new IllegalArgumentException("Negative times not allowed");
        }
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}