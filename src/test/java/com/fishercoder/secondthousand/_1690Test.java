package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1690;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1690Test {
    private _1690.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1690.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
    }

}