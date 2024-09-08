package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._330;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _330Test {
    private _330.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setUp() {
        solution1 = new _330.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 2, 4, 13, 43};
        List<Integer> expected = new ArrayList(Arrays.asList(8, 29));
        assertEquals(expected, solution1.findPatches(nums, 100));
        assertEquals(2, solution1.minPatches(nums, 100));
    }
}
