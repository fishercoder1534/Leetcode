package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.secondthousand._1243;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1243Test {
    private _1243.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1243.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {6, 2, 3, 4};
        assertTrue(solution1.transformArray(arr).equals(Arrays.asList(6, 3, 3, 4)));
    }

    @Test
    public void test2() {
        arr = new int[] {1, 6, 3, 4, 3, 5};
        assertTrue(solution1.transformArray(arr).equals(Arrays.asList(1, 4, 4, 4, 4, 5)));
    }
}
