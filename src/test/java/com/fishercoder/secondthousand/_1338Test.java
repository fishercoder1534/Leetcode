package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1338;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1338Test {
    private _1338.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1338.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        assertEquals(2, solution1.minSetSize(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{7, 7, 7, 7, 7, 7};
        assertEquals(1, solution1.minSetSize(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{1, 9};
        assertEquals(1, solution1.minSetSize(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{1000, 1000, 3, 7};
        assertEquals(1, solution1.minSetSize(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(5, solution1.minSetSize(arr));
    }

}