package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1055;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1055Test {
    private _1055.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1055.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.fixedPoint(new int[]{-10, -5, 0, 3, 7}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.fixedPoint(new int[]{0, 2, 5, 8, 17}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.fixedPoint(new int[]{-10, -5, 3, 4, 7, 9}));
    }

}