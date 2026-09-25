package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fifththousand._4048;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4048Test {
    private _4048.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4048.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countSpecialIntegers(new int[] {1, 8, 1, 5, 1, 5, 8, 5}));
    }
}
