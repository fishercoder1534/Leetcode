package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.fifththousand._4065;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4065Test {
    private _4065.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4065.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {1, 2, 3, 1, 3, 3},
                solution1.rearrangeArray(new int[] {3, 1, 3, 2, 1, 3}));
    }
}
