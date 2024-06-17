package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2231;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2231Test {
    private static _2231.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2231.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3412, solution1.largestInteger(1234));
    }

    @Test
    public void test2() {
        assertEquals(87655, solution1.largestInteger(65875));
    }

    @Test
    public void test3() {
        assertEquals(427, solution1.largestInteger(247));
    }

    @Test
    public void test4() {
        assertEquals(472, solution1.largestInteger(274));
    }

    @Test
    public void test5() {
        assertEquals(75856, solution1.largestInteger(55678));
    }
}
