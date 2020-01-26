package com.ictexpertsgroup.code;

import org.junit.Assert;
import  org.junit.Before;
import org.junit.Test;

public class HourGlassProblemTest {

    private HourGlassProblem hourGlassProblem;

    @Before
    public void setup() throws Exception{
        hourGlassProblem=new HourGlassProblem();
    }

    @Test
    public void hourglassSumTest() {
        int [][] arrTest = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        int testResult = hourGlassProblem.hourglassSum(arrTest);

        Assert.assertEquals(13, testResult);

    }
}