package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1346;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1346Test {
    private _1346.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1346.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {10, 2, 5, 3};
        assertEquals(true, solution1.checkIfExist(arr));
    }

    @Test
    public void test2() {
        arr = new int[] {7, 1, 14, 11};
        assertEquals(true, solution1.checkIfExist(arr));
    }

    @Test
    public void test3() {
        arr = new int[] {3, 1, 7, 11};
        assertEquals(false, solution1.checkIfExist(arr));
    }
}
