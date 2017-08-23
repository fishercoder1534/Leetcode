package com.fishercoder;

import com.fishercoder.solutions._356;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/1/17.
 */
public class _356Test {
    private static _356 test;
    private static int[][] points;

    @BeforeClass
    public static void setup() {
        test = new _356();
    }

    @Test
    public void test1() {
        points = new int[][]{
                {1, 1},
                {-1, 1},
        };
        assertEquals(true, test.isReflected(points));
    }

    @Test
    public void test2() {
        points = new int[][]{
                {1, 1},
                {-1, -1},
        };
        assertEquals(false, test.isReflected(points));
    }
}
