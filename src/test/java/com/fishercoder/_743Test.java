package com.fishercoder;

import com.fishercoder.solutions._743;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _743Test {
    private static _743.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _743.Solution1();
    }

    @Test
    public void test1() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(solution1.networkDelayTime(times, 4, 2), 2);
    }

    @Test
    public void test2() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(solution1.networkDelayTime(times, 4, 3), -1);
    }
}
