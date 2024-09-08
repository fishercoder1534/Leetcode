package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1099;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1099Test {
    private _1099.Solution1 solution1;
    private _1099.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1099.Solution1();
        solution2 = new _1099.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(58, solution1.twoSumLessThanK(new int[] {34, 23, 1, 24, 75, 33, 54, 8}, 60));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.twoSumLessThanK(new int[] {10, 20, 30}, 15));
    }

    @Test
    public void test3() {
        assertEquals(58, solution2.twoSumLessThanK(new int[] {34, 23, 1, 24, 75, 33, 54, 8}, 60));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution2.twoSumLessThanK(new int[] {10, 20, 30}, 15));
    }
}
