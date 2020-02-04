package com.fishercoder;

import com.fishercoder.solutions._1176;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1176Test {
    private static _1176.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1176.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.dietPlanPerformance(new int[]{1, 2, 3, 4, 5}, 1, 3, 3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.dietPlanPerformance(new int[]{3, 2}, 2, 0, 1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.dietPlanPerformance(new int[]{6, 5, 0, 0}, 2, 1, 5));
    }
}
