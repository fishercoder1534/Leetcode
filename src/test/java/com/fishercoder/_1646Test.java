package com.fishercoder;

import com.fishercoder.solutions._1646;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1646Test {
    private static _1646.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1646.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.getMaximumGenerated(3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.getMaximumGenerated(2));
    }

}