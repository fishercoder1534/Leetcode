package com.fishercoder;

import com.fishercoder.solutions._1431;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1431Test {
    private static _1431.Solution1 solution1;
    private static int[] candies;

    @BeforeClass
    public static void setup() {
        solution1 = new _1431.Solution1();
    }

    @Test
    public void test1() {
        candies = new int[]{2, 3, 5, 1, 3};
        assertEquals(Arrays.asList(true, true, true, false, true), solution1.kidsWithCandies(candies, 3));
    }

}