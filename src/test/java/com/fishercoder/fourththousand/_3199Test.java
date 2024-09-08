package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3199;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3199Test {
    private _3199.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3199.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.tripletCount(new int[] {1}, new int[] {2}, new int[] {3}));
    }

    @Test
    public void test2() {
        assertEquals(
                4, solution1.tripletCount(new int[] {1, 1}, new int[] {2, 3}, new int[] {1, 5}));
    }

    @Test
    public void test3() {
        assertEquals(
                9,
                solution1.tripletCount(
                        new int[] {0, 6, 0}, new int[] {8, 8, 4}, new int[] {6, 9, 2}));
    }
}
