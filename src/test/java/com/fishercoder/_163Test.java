package com.fishercoder;

import com.fishercoder.solutions.firstthousand._163;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _163Test {

    private static _163.Solution1 solution1;
    private static List<List<Integer>> expected;
    private static List<List<Integer>> actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _163.Solution1();
        expected = new ArrayList();
        actual = new ArrayList();

        expected.clear();
        actual.clear();
    }

    @Test
    public void test1() {
        nums = new int[]{2147483647};
        expected.add(Arrays.asList(0, 2147483646));
        actual = solution1.findMissingRanges(nums, 0, 2147483647);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        nums = new int[]{-2147483648, 0, 2147483647};
        expected.add(Arrays.asList(-2147483647, -1));
        expected.add(Arrays.asList(1, 2147483646));
        actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        nums = new int[]{};
        expected.add(Arrays.asList(-2147483648, 2147483647));
        actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        nums = new int[]{2147483647};
        expected.add(Arrays.asList(-2147483648, 2147483646));
        actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        nums = new int[]{};
        expected.add(Arrays.asList(0, 2147483647));
        actual = solution1.findMissingRanges(nums, 0, 2147483647);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        nums = new int[]{-2147483648};
        expected.add(Arrays.asList(-2147483647, 2147483647));
        actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
        assertEquals(expected, actual);
    }
}
