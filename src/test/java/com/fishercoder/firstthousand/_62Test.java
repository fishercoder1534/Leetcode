package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._62;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _62Test {
    private _62.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _62.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.uniquePaths(1, 2));
    }
}
