package com.fishercoder;

import com.fishercoder.solutions._1234;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class _1234Test {
    private static _1234.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1234.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{6, 2, 3, 4};
        assertTrue(solution1.transformArray(arr).equals(Arrays.asList(6, 3, 3, 4)));
    }

    @Test
    public void test2() {
        arr = new int[]{1, 6, 3, 4, 3, 5};
        assertTrue(solution1.transformArray(arr).equals(Arrays.asList(1, 4, 4, 4, 4, 5)));
    }

}