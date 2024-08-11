package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1685;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1685Test {
    private _1685.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1685.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 3, 5};
        assertArrayEquals(new int[]{4, 3, 5}, solution1.getSumAbsoluteDifferences(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 4, 6, 8, 10};
        assertArrayEquals(new int[]{24, 15, 13, 15, 21}, solution1.getSumAbsoluteDifferences(nums));
    }

}