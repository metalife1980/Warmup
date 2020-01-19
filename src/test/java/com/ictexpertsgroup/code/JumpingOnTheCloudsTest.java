package com.ictexpertsgroup.code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class JumpingOnTheCloudsTest {
    JumpingOnTheClouds jotc ;

    @Test
    public void jumpingOnClouds() {


        int [] clouds = {0,0, 1, 0, 0, 1, 0};

        int result = jotc.jumpingOnTheClouds(clouds);

        Assert.assertEquals(4, result);
    }

    @Before
    public void setUp() throws Exception {
        jotc = new JumpingOnTheClouds();
    }

    @Test
    public void validateInputTest(){
        int [] input1 = {0,0, 1, 0, 0, 1, 0};
        int [] input2 = {0,0, 1, 2, 0, 1, 0};

        boolean result1 = jotc.validateGameInput(input1);
        boolean result2 = jotc.validateGameInput(input2);

        Assert.assertTrue(result1==true);
        Assert.assertTrue(result2==false);

    }
}