package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._276;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _276Test {
    private _276.Solution1 solution1;
    private _276.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _276.Solution1();
        solution2 = new _276.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.numWays(3, 2));
        assertEquals(6, solution2.numWays(3, 2));
    }
}
