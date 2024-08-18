package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._826;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _826Test {
    private _826.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _826.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                100,
                solution1.maxProfitAssignment(
                        new int[] {2, 4, 6, 8, 10},
                        new int[] {10, 20, 30, 40, 50},
                        new int[] {4, 5, 6, 7}));
    }

    @Test
    public void test2() {
        assertEquals(
                324,
                solution1.maxProfitAssignment(
                        new int[] {68, 35, 52, 47, 86},
                        new int[] {67, 17, 1, 81, 3},
                        new int[] {92, 10, 85, 84, 82}));
    }

    @Test
    public void test3() {
        assertEquals(
                190,
                solution1.maxProfitAssignment(
                        new int[] {13, 37, 58}, new int[] {4, 90, 96}, new int[] {34, 73, 45}));
    }
}
