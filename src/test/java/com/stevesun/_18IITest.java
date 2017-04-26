package com.stevesun;

import com.stevesun.solutions._454;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _18IITest {
    private static _454 test;
    private static int expected;
    private static int actual;
    private static int[] A;
    private static int[] B;
    private static int[] C;
    private static int[] D;

    @BeforeClass
    public static void setup(){
        test = new _454();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        A = new int[1000];
        B = new int[1000];
        C = new int[1000];
        D = new int[1000];
    }

    @Test
    public void test1(){

        A = new int[]{1,2};
        B = new int[]{-2,-1};
        C = new int[]{-1,2};
        D = new int[]{0,2};
        expected = 2;
        actual = test.fourSumCount(A, B, C, D);
        assertEquals(expected, actual);

    }
}
