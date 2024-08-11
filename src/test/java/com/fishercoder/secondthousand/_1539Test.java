package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1539;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1539Test {
    private _1539.Solution1 solution1;
    private _1539.Solution2 solution2;
    private _1539.Solution3 solution3;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1539.Solution1();
        solution2 = new _1539.Solution2();
        solution3 = new _1539.Solution3();
    }

    @Test
    public void test1() {
        arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, solution1.findKthPositive(arr, 5));
    }

    @Test
    public void test2() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution1.findKthPositive(arr, 2));
    }

    @Test
    public void test3() {
        arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, solution2.findKthPositive(arr, 5));
    }

    @Test
    public void test4() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution2.findKthPositive(arr, 2));
    }

    @Test
    public void test5() {
        arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, solution3.findKthPositive(arr, 5));
    }

    @Test
    public void test6() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution3.findKthPositive(arr, 2));
    }

}