package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1118;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1118Test {
    private _1118.Solution1 solution1;

    @BeforeEach
    public void setupForEachTest() {
        solution1 = new _1118.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(31, solution1.numberOfDays(1992, 7));
    }

    @Test
    public void test2() {
        assertEquals(29, solution1.numberOfDays(2000, 2));
    }

    @Test
    public void test3() {
        assertEquals(28, solution1.numberOfDays(1900, 2));
    }

    @Test
    public void test4() {
        assertEquals(29, solution1.numberOfDays(1836, 2));
    }

}