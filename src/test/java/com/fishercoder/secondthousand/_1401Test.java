package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1401;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1401Test {
    private _1401.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1401.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkOverlap(1, 0, 0, 1, -1, 3, 1));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.checkOverlap(1, 0, 0, -1, 0, 0, 1));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.checkOverlap(1, 1, 1, -3, -3, 3, 3));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.checkOverlap(1, 1, 1, 1, -3, 2, 1));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.checkOverlap(1, 1, 1, 1, -3, 2, -1));
    }

}