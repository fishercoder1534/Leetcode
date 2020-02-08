package com.fishercoder;

import com.fishercoder.solutions._1343;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1343Test {
    private static _1343.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1343.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.numOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1, 0));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.numOfSubarrays(new int[]{7, 7, 7, 7, 7, 7, 7}, 7, 7));
    }

}