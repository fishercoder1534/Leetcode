package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._454;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _454Test {
    private _454.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] A;
    private static int[] B;
    private static int[] C;
    private static int[] D;

    @BeforeEach
    public void setup() {
        solution1 = new _454.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {1, 2};
        B = new int[] {-2, -1};
        C = new int[] {-1, 2};
        D = new int[] {0, 2};
        expected = 2;
        actual = solution1.fourSumCount(A, B, C, D);
        assertEquals(expected, actual);
    }
}
