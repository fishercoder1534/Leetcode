package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3095;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3095Test {
    private static _3095.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3095.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minimumSubarrayLength(new int[]{1, 12, 2, 5}, 43));
    }

}