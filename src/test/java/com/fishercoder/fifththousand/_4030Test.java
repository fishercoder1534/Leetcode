package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.fifththousand._4030;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4030Test {
    private _4030.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4030.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isPalindromic("ff"));
    }
}
