package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _39Test {
    private _39.Solution1 solution1;
    private static int[] candidates;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _39.Solution1();
    }

    @Test
    public void test1() {
        candidates = new int[] {2, 3, 6, 7};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));
        assertEquals(expected, solution1.combinationSum(candidates, 7));
    }
}
