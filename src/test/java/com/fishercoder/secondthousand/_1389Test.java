package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1389;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1389Test {
    private _1389.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1389.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {0, 4, 1, 3, 2},
                solution1.createTargetArray(new int[] {0, 1, 2, 3, 4}, new int[] {0, 1, 2, 2, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[] {0, 1, 2, 3, 4},
                solution1.createTargetArray(new int[] {1, 2, 3, 4, 0}, new int[] {0, 1, 2, 3, 0}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {1}, solution1.createTargetArray(new int[] {1}, new int[] {0}));
    }
}
