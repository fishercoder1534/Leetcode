package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1151;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1151Test {
    private _1151.Solution1 solution1;
    private static int[] data;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1151.Solution1();
    }

    @Test
    public void test1() {
        data = new int[]{1, 0, 1, 0, 1};
        expected = 1;
        assertEquals(expected, solution1.minSwaps(data));
    }

    @Test
    public void test2() {
        data = new int[]{0, 0, 0, 1, 0};
        expected = 0;
        assertEquals(expected, solution1.minSwaps(data));
    }

    @Test
    public void test3() {
        data = new int[]{1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        expected = 3;
        assertEquals(expected, solution1.minSwaps(data));
    }

    @Test
    public void test4() {
        data = new int[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1};
        expected = 8;
        assertEquals(expected, solution1.minSwaps(data));
    }

    @Test
    public void test5() {
        data = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        expected = 0;
        assertEquals(expected, solution1.minSwaps(data));
    }

}