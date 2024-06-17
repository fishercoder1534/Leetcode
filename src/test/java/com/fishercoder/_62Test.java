package com.fishercoder;

import com.fishercoder.solutions.first_thousand._62;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _62Test {
    private static _62.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _62.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.uniquePaths(1, 2));
    }
}
