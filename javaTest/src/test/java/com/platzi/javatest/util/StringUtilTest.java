package com.platzi.javatest.util;

public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("Hola",1), "Hola");
        assertEquals(StringUtil.repeat("Hola",3), "HolaHolaHola");
    }

    private static void assertEquals(String actual, String expected) {

        if(!actual.equals(expected)){
            throw new RuntimeException(actual + " is not to expected" + expected);
        }
    }
}