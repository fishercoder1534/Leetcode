package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1708;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1708Test {
    private _1708.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1708.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 2, 3}, solution1.largestSubarray(new int[]{1, 4, 5, 2, 3}, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{5}, solution1.largestSubarray(new int[]{1, 4, 5, 2, 3}, 1));
    }

}