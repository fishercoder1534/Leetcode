package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1004;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1004Test {
    private _1004.Solution1 solution1;
    private static int[] A;

    @BeforeEach
    public void setup() {
        solution1 = new _1004.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, solution1.longestOnes(A, 2));
    }
}
