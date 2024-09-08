package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1426;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1426Test {
    private _1426.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1426.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {1, 1, 3, 3, 5, 5, 7, 7};
        assertEquals(0, solution1.countElements(arr));
    }
}
