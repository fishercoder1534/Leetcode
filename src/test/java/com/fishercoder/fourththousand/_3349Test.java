package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.fourththousand._3349;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3349Test {
    private _3349.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3349.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(
                solution1.hasIncreasingSubarrays(Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3));
    }

    @Test
    public void test2() {
        assertFalse(
                solution1.hasIncreasingSubarrays(Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5));
    }

    @Test
    public void test3() {
        assertTrue(solution1.hasIncreasingSubarrays(Arrays.asList(5, 8, -2, -1), 2));
    }
}
