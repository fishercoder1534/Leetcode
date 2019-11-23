package com.fishercoder;

import com.fishercoder.solutions._1200;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1200Test {
    private static _1200.Solution1 solution1;
    private static int[] arr;
    private static List<List<Integer>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1200.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{4, 2, 1, 3};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, solution1.minimumAbsDifference(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{40, 11, 26, 27, -20};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(26, 27));
        assertEquals(expected, solution1.minimumAbsDifference(arr));
    }

}