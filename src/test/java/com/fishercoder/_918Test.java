package com.fishercoder;

import com.fishercoder.solutions._918;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _918Test {
    private static _918.Solution1 solution1;
    private static _918.Solution2 solution2;
    private static _918.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _918.Solution1();
        solution2 = new _918.Solution2();
        solution3 = new _918.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.maxSubarraySumCircular(new int[]{5, -3, 5}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.maxSubarraySumCircular(new int[]{3, -1, 2, -1}));
    }

    @Test
    public void test4() {
        assertEquals(3, solution1.maxSubarraySumCircular(new int[]{3, -2, 2, -3}));
    }

    @Test
    public void test5() {
        assertEquals(-1, solution1.maxSubarraySumCircular(new int[]{-2, -3, -1}));
    }

    @Test
    public void test6() {
        assertEquals(10, solution1.maxSubarraySumCircular(new int[]{5, -3, 5}));
    }

    @Test
    public void test7() {
        assertEquals(10, solution2.maxSubarraySumCircular(new int[]{5, -3, 5}));
    }

    @Test
    public void test8() {
        assertEquals(10, solution3.maxSubarraySumCircular(new int[]{5, -3, 5}));
    }
}