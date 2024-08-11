package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1496;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1496Test {
    private _1496.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1496.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPathCrossing("NES"));
    }

}