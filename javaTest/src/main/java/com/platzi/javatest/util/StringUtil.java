package com.platzi.javatest.util;

public class StringUtil {

    public static String repeat(String str, int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += " ";
            result += str;
        }
        return result;
    }
}
