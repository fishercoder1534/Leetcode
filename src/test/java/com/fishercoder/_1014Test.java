package com.fishercoder;

import com.fishercoder.solutions._1014;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1014Test {
    private static _1014.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1014.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(solution1.maxScoreSightseeingPair(new int[]{1, 3, 5}), 7);
    }

    @Test
    public void test2() {
        assertEquals(solution1.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}), 11);
    }
}
