package com.platzi.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilChallengeTest {

    @Test
    public void string_not_empty_test(){
        Boolean ans = StringUtilChallenge.isEmpty("Not Emty");
        assertFalse(ans);
    }

    @Test
    public void string_empty_test(){
        Boolean ans = StringUtilChallenge.isEmpty("");
        assertTrue(ans);
    }

    @Test
    public void string_empty_null_test(){
        Boolean ans = StringUtilChallenge.isEmpty("null");
        assertTrue(ans);
    }

    @Test
    public void string_empty_with_spaces_test(){
        Boolean ans = StringUtilChallenge.isEmpty(" ");
        assertTrue(ans);
    }

}