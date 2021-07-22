package com.platzi.javatest.util;

import org.junit.Test;

import static com.platzi.javatest.util.PasswordUtil.SecurityLevel.*;
import static com.platzi.javatest.util.PasswordUtil.assessPassword;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_less_than_8_letters(){
        assertEquals(WEAK, assessPassword("q5!$"));
    }

    @Test
    public void weak_when_less_only_letters(){
        assertEquals(WEAK, assessPassword("qwerty"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, assessPassword("qwerty12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(STRONG, assessPassword("qwerty12345!$"));
    }

}