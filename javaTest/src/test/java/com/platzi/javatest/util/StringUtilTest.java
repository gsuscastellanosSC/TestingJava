package com.platzi.javatest.util;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = "";

        result = StringUtil.repeat("Hola",1);
        if(!result.equals(" Hola")){
            System.out.println("error");
        }

        result = StringUtil.repeat("Hola",3);
        if(!result.equals(" Hola Hola Hola")){
            System.out.println("error");
        }
    }
}