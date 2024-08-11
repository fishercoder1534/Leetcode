package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._216;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _216Test {
    private _216.Solution1 solution1;
    private static int k;
    private static int n;

    @BeforeEach
    public void setup() {
        solution1 = new _216.Solution1();
    }

    @Test
    public void test1() {
        k = 3;
        n = 7;
        assertEquals(Arrays.asList(Arrays.asList(1, 2, 4)), solution1.combinationSum3(k, n));
    }

}
