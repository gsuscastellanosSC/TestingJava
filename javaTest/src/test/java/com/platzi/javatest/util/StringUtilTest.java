package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_test() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola",1));
    }

    @Test
    public void repeat_three_test() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola",3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_negative_test() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola",-3));
    }

}