package com.fishercoder;

import com.fishercoder.solutions.first_thousand._216;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _216Test {
    private static _216.Solution1 solution1;
    private static int k;
    private static int n;

    @BeforeClass
    public static void setup() {
        solution1 = new _216.Solution1();
    }

    @Test
    public void test1() {
        k = 3;
        n = 7;
        assertEquals(Arrays.asList(Arrays.asList(1, 2, 4)), solution1.combinationSum3(k, n));
    }

}
