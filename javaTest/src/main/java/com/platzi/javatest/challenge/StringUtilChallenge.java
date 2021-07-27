package com.platzi.javatest.challenge;

public class StringUtilChallenge {

    public static boolean isEmpty(String str) {
        if(str == "null"){
            str="";
        }
        return str.trim().isEmpty();
    }
}
