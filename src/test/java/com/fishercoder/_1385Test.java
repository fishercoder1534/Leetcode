package com.fishercoder;

import com.fishercoder.solutions._1385;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1385Test {
    private static _1385.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1385.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
    }

}