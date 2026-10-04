package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3813;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3813Test {
    private _3813.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _3813.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.vowelConsonantScore("cooear"));
    }
}
