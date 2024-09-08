package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1200;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1200Test {
    private _1200.Solution1 solution1;
    private static int[] arr;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1200.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {4, 2, 1, 3};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, solution1.minimumAbsDifference(arr));
    }

    @Test
    public void test2() {
        arr = new int[] {40, 11, 26, 27, -20};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(26, 27));
        assertEquals(expected, solution1.minimumAbsDifference(arr));
    }
}
