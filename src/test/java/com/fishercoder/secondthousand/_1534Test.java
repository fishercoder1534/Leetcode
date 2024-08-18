package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1534;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1534Test {
    private _1534.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1534.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {3, 0, 1, 1, 9, 7};
        assertEquals(4, solution1.countGoodTriplets(arr, 7, 2, 3));
    }
}
