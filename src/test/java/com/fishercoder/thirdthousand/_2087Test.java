package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2087;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2087Test {
    private _2087.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2087.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(18, (solution1.minCost(new int[]{1, 0}, new int[]{2, 3}, new int[]{5, 4, 3}, new int[]{8, 2, 6, 7})));
    }

    @Test
    public void test2() {
        assertEquals(0, (solution1.minCost(new int[]{0, 0}, new int[]{0, 0}, new int[]{5}, new int[]{26})));
    }

    @Test
    public void test3() {
        assertEquals(62, (solution1.minCost(new int[]{1, 0}, new int[]{4, 3}, new int[]{3, 1, 0, 10, 27}, new int[]{0, 0, 9, 16, 29, 28})));
    }
}
