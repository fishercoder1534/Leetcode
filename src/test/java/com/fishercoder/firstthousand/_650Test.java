package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._650;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _650Test {
    private _650.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _650.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minSteps(3));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.minSteps(20));
    }

    @Test
    public void test3() {
        assertEquals(19, solution1.minSteps(19));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.minSteps(1));
    }

    @Test
    public void test5() {
        assertEquals(35, solution1.minSteps(741));
    }
}
