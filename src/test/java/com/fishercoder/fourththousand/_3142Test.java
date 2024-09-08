package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3142;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3142Test {
    private _3142.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3142.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.satisfiesConditions(new int[][] {{1}, {2}, {3}}));
    }
}
