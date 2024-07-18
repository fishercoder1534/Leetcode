package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2300;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2300Test {
    private static _2300.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2300.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 0, 3}, solution1.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 0, 2}, solution1.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 3, 3, 4}, solution1.successfulPairs(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}, 25));
    }

}