package com.fishercoder;

import com.fishercoder.solutions._2012;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2012Test {
    private static _2012.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2012.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.sumOfBeauties(new int[]{2, 4, 6, 4}));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.sumOfBeauties(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.sumOfBeauties(new int[]{9, 9, 3, 8, 7, 9, 6, 10}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.sumOfBeauties(new int[]{8, 4, 6, 3, 10, 5, 8, 5, 5, 9}));
    }

}