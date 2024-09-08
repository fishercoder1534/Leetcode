package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._198;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _198Test {
    private _198.Solution1 solution1;
    private _198.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _198.Solution1();
        solution2 = new _198.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.rob(new int[] {1, 2, 3, 1}));
        assertEquals(4, solution2.rob(new int[] {1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.rob(new int[] {2, 1, 1, 2}));
    }
}
