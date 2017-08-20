package com.fishercoder;

import com.fishercoder.solutions._661;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _661Test {
    private static _661 test;
    private static int[][] M;
    private static int[][] expected;

    @BeforeClass
    public static void setup(){
        test = new _661();
    }

    @Test
    public void test1(){
        M = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        expected = M = new int[][]{
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        assertArrayEquals(expected, test.imageSmoother(M));
    }

}
