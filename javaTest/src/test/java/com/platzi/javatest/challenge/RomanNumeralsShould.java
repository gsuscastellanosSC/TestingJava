package com.platzi.javatest.challenge;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RomanNumeralsShould {

    @Test
    public void return_roman_number_1_to_I(){
        assertThat(RomanNumerals.arabicToRoman(1), is("I"));
    }
}