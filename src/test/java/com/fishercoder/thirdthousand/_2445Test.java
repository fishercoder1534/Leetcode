package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2445;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2445Test {
    private _2445.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2445.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numberOfNodes(5, new int[]{1, 2, 5}));
    }
}
