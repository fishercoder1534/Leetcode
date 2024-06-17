package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2670;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _2670Test {
    private static _2670.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2670.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{-2, -1, 0, 2, 3}, solution1.distinctDifferenceArray(new int[]{3, 2, 3, 4, 2}));
    }

}