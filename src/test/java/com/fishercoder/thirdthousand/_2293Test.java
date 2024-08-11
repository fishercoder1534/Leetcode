package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2293;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2293Test {
    private _2293.Solution1 solution1;
    private static int expected;
    private static int[] nums;
    private static String s;

    @BeforeEach
    public void setup() {
        solution1 = new _2293.Solution1();
    }

    @Test
    public void test1() {
        expected = 22;
        nums = new int[]{70, 38, 21, 22};
        assertEquals(expected, solution1.minMaxGame(nums));
    }

}