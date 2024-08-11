package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._506;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _506Test {
    private _506.Solution1 solution1;
    private static String[] expected;
    private static String[] actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _506.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = new String[]{};
        actual = new String[]{};
    }

    @Test
    public void test1() {
        nums = new int[]{2, 4, 1};
        expected = new String[]{"Silver Medal", "Gold Medal", "Bronze Medal"};
        actual = solution1.findRelativeRanks(nums);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        nums = new int[]{5, 4, 3, 2, 1};
        expected = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        actual = solution1.findRelativeRanks(nums);
        assertArrayEquals(expected, actual);

    }
}
