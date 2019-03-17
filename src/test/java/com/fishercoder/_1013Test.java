package com.fishercoder;

import com.fishercoder.solutions._1013;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1013Test {
    private static _1013.Solution1 solution1;
    private static int[] time;

    @BeforeClass
    public static void setup() {
        solution1 = new _1013.Solution1();
    }

    @Test
    public void test1() {
        time = new int[]{30, 20, 150, 100, 40};
        assertEquals(3, solution1.numPairsDivisibleBy60(time));
    }

    @Test
    public void test2() {
        time = new int[]{60, 60, 60};
        assertEquals(3, solution1.numPairsDivisibleBy60(time));
    }

}
