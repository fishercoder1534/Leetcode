package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._888;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _888Test {
    private _888.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _888.Solution1();
    }

    @Test
    public void test1() {
        int [] A = {1, 1};
        int [] B = {2, 2};
        int [] ans = {1, 2};
        assertArrayEquals(ans, solution1.fairCandySwap(A, B));
    }

    @Test
    public void test2() {
        int [] A = {1, 2};
        int [] B = {2, 3};
        int [] ans = {1, 2};
        assertArrayEquals(ans, solution1.fairCandySwap(A, B));
    }

    @Test
    public void test3() {
        int [] A = {2};
        int [] B = {1, 3};
        int [] ans = {2, 3};
        assertArrayEquals(ans, solution1.fairCandySwap(A, B));
    }

    @Test
    public void test4() {
        int [] A = {1, 2, 5};
        int [] B = {2, 4};
        int [] ans = {5, 4};
        assertArrayEquals(ans, solution1.fairCandySwap(A, B));
    }
}