package com.fishercoder;

import com.fishercoder.solutions._1675;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1675Test {
    private static _1675.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1675.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minimumDeviation(new int[]{1, 2, 3, 4}));
    }

}