package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1446;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1446Test {
    private _1446.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1446.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.maxPower("leetcode"));
    }
}
