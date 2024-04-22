package com.fishercoder;

import com.fishercoder.solutions._39;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _39Test {
    private static _39.Solution1 solution1;
    private static int[] candidates;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _39.Solution1();
    }

    @Test
    public void test1() {
        candidates = new int[]{2, 3, 6, 7};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));
        assertEquals(expected, solution1.combinationSum(candidates, 7));
    }
}
