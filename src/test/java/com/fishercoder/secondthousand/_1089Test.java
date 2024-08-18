package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1089;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1089Test {
    private _1089.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1089.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
        solution1.duplicateZeros(arr);
        assertArrayEquals(new int[] {1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    public void test2() {
        arr = new int[] {1, 2, 3};
        solution1.duplicateZeros(arr);
        assertArrayEquals(new int[] {1, 2, 3}, arr);
    }
}
