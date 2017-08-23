package com.fishercoder;

import com.fishercoder.solutions._502;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/2/17.
 */
public class _502Test {
    private static _502 test;
    private static int[] Profits;
    private static int[] Capital;

    @BeforeClass
    public static void setup() {
        test = new _502();
    }

    @Test
    public void test1() {
        Profits = new int[]{1, 2, 3};
        Capital = new int[]{0, 1, 1};
        assertEquals(4, test.findMaximizedCapital(2, 0, Profits, Capital));
    }
}
