package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1481;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1481Test {
    private _1481.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1481.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {5, 5, 4};
        assertEquals(1, solution1.findLeastNumOfUniqueInts(arr, 1));
    }
}
