package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._228;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _228Test {
    private _228.Solution1 solution1;
    private static List<String> expected;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _228.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 1, 2, 4, 5, 7};
        expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected, solution1.summaryRanges(nums));
    }
}
