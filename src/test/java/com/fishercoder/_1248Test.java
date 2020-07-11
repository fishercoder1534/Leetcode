package com.fishercoder;

import com.fishercoder.solutions._1248;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1248Test {
    private static _1248.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1248.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numberOfSubarrays(new int[]{2, 4, 6}, 1));
    }

    @Test
    public void test3() {
        assertEquals(16, solution1.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }

}