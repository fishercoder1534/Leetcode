package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1502;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1502Test {
    private _1502.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1502.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{3, 5, 1};
        assertEquals(true, solution1.canMakeArithmeticProgression(arr));
    }

}