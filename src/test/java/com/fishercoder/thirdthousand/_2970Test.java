package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2970;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2970Test {
    private _2970.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2970.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.incremovableSubarrayCount(new int[] {6, 5, 7, 8}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.incremovableSubarrayCount(new int[] {8, 7, 6, 6}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.incremovableSubarrayCount(new int[] {8, 7, 6, 6}));
    }
}
