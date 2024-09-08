package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1945;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1945Test {
    private _1945.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1945.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.getLucky("zbax", 2));
    }

    @Test
    public void test2() {
        assertEquals(36, solution1.getLucky("iiii", 1));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.getLucky("leetcode", 2));
    }

    @Test
    public void test4() {
        assertEquals(8, solution1.getLucky("zbax", 2));
    }

    @Test
    public void test5() {
        assertEquals(8, solution1.getLucky("fleyctuuajsr", 5));
    }
}
