package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._658;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _658Test {
    private _658.Solution1 solution1;
    private static List<Integer> arr;
    private static List<Integer> expected;
    private static int k;
    private static int x;

    @BeforeEach
    public void setup() {
        solution1 = new _658.Solution1();
    }

    @Test
    public void test1() {
        k = 4;
        x = 3;
        expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, solution1.findClosestElements(arr, k, x));
    }

    @Test
    public void test2() {
        k = 4;
        x = -1;
        expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, solution1.findClosestElements(arr, k, x));
    }

    @Test
    public void test3() {
        k = 3;
        x = 5;
        arr = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 3, 3, 4, 7, 7, 8));
        expected = new ArrayList<>(Arrays.asList(3, 3, 4));
        assertEquals(expected, solution1.findClosestElements(arr, k, x));
    }
}
