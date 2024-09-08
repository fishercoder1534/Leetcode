package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1342;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1342Test {
    private _1342.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1342.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.numberOfSteps(123));
    }

    @Test
    public void test2() {
        assertEquals(6, solution1.numberOfSteps(14));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numberOfSteps(8));
    }
}
