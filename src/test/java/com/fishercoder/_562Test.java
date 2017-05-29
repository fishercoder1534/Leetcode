package com.fishercoder;

import com.fishercoder.solutions._562;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 4/23/17.
 */
public class _562Test {
    private static _562 test;
    private static int expected;
    private static int actual;
    private static int[][] M;

    @BeforeClass
    public static void setup(){
        test = new _562();
    }

    @Test
    public void test1(){
        M = new int[][]{
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,1}
        };
        expected = 3;
        actual = test.longestLine(M);
        assertEquals(expected, actual);
    }

}
