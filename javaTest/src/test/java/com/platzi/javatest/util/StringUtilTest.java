package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeatTest() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola",1));
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola",3));
    }

}