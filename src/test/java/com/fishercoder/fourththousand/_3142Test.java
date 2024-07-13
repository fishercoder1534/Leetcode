package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3142;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3142Test {
    private static _3142.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3142.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.satisfiesConditions(new int[][]{{1}, {2}, {3}}));
    }

}