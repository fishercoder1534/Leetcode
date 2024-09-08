package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1574;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1574Test {
    private _1574.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1574.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {1, 2, 3, 10, 4, 2, 3, 5};
        assertEquals(3, solution1.findLengthOfShortestSubarray(arr));
    }
}
