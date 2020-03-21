package com.fishercoder;

import com.fishercoder.solutions._1387;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1387Test {
    private static _1387.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1387.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.getKth(12, 15, 2));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.getKth(1, 1, 1));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.getKth(7, 11, 4));
    }
}