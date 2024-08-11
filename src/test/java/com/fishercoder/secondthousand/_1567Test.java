package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1567;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1567Test {
    private _1567.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1567.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.getMaxLen(new int[]{1, -2, -3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.getMaxLen(new int[]{0, 1, -2, -3, -4}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.getMaxLen(new int[]{-1, -2, -3, 0, 1}));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.getMaxLen(new int[]{-1, 2}));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.getMaxLen(new int[]{1, 2, 3, 5, -6, 4, 0, 10}));
    }

    @Test
    public void test6() {
        assertEquals(0, solution1.getMaxLen(new int[]{-1}));
    }

}