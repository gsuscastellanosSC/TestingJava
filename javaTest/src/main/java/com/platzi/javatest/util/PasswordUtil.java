package com.platzi.javatest.util;

public class PasswordUtil {
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG

    }

    public static SecurityLevel assessPassword(String password) {
        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
