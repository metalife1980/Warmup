package com.ictexpertsgroup.code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepeatedStringTest {

    RepeatedString repeatedString;
    @Before
    public void setUp() throws Exception {
        repeatedString = new RepeatedString();
    }

    @Test
    public void repeatedStringTest() {

        Assert.assertEquals(7L, repeatedString.repeatedString("aba", 10));
    }

    @Test
    public void validateInputTest() {
        Assert.assertTrue(repeatedString.validateInput("aba")==true);
        Assert.assertTrue(repeatedString.validateInput("asba")==false);
    }
}