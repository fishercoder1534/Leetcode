package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1636;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1636Test {
    private static _1636.Solution1 solution1;
    private static _1636.Solution2 solution2;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1636.Solution1();
        solution2 = new _1636.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 2, 2, 3};
        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, solution2.frequencySort(nums));
        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, solution1.frequencySort(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{-53, -53, 52, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, -53, 52, 52, -53, 52, -53, 52, -53, 52, 52, 52, 52, 52, 52, 52, 52, 52, -53, 52, -53, 52, -53, 52, 52, 52, -53, -53, 52, -53, 52, 52, 52, 52, -53, -53, -53, -53, -53, 52, 52, -53, 52, -53, 52, 52, 52};
        assertArrayEquals(new int[]{-53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, -53, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, solution1.frequencySort(nums));
    }

}