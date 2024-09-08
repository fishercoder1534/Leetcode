package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._479;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _479Test {
    private _479.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _479.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(123, solution1.largestPalindrome(3));
    }
}
