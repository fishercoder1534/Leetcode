package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1646;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1646Test {
    private _1646.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1646.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.getMaximumGenerated(3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.getMaximumGenerated(2));
    }

}