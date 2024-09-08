package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._683;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _683Test {
    private _683.Solution1 solution1;
    private static int[] flowers;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _683.Solution1();
    }

    @Test
    public void test1() {
        flowers = new int[] {1, 3, 2};
        k = 1;
        assertEquals(2, solution1.kEmptySlots(flowers, k));
    }

    @Test
    public void test2() {
        flowers = new int[] {1, 2, 3};
        k = 1;
        assertEquals(-1, solution1.kEmptySlots(flowers, k));
    }
}
