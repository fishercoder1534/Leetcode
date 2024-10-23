package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3185;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3185Test {
    private _3185.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3185.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countCompleteDayPairs(new int[] {12, 12, 30, 24, 24}));
    }
}
