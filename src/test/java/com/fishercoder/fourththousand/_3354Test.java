package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3354;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3354Test {
    private _3354.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3354.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countValidSelections(new int[] {1, 0, 2, 0, 3}));
    }

    @Test
    public void test2() {
        assertEquals(
                3, solution1.countValidSelections(new int[] {16, 13, 10, 0, 0, 0, 10, 6, 7, 8, 7}));
    }
}
