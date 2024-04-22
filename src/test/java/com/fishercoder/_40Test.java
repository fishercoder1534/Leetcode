package com.fishercoder;

import com.fishercoder.solutions._40;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _40Test {
    private static _40.Solution1 solution1;
    private static int[] candidates;
    private static int target;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _40.Solution1();
    }

    @Test
    public void test1() {
        candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        expected = Arrays.asList((Arrays.asList(1, 1, 6)), Arrays.asList(1, 2, 5), Arrays.asList(1, 7), Arrays.asList(2, 6));
        target = 8;
        assertEquals(expected, solution1.combinationSum2(candidates, target));
    }

    @Test
    public void test2() {
        candidates = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        expected = Arrays.asList(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        target = 30;
        assertEquals(expected, solution1.combinationSum2(candidates, target));
    }
}
