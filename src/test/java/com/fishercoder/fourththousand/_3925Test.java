package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.fourththousand._3925;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3925Test {
    private _3925.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3925.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {1, 2, 3, 3, 2, 1}, solution1.concatWithReverse(new int[] {1, 2, 3}));
    }
}
