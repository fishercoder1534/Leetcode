package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1230;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1230Test {
    private static _1230.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1230.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0.4, solution1.probabilityOfHeads(new double[]{0.4}, 1));
    }

    @Test
    public void test2() {
        assertEquals(0.03125, solution1.probabilityOfHeads(new double[]{0.5, 0.5, 0.5, 0.5, 0.5}, 0));
    }

    @Test
    public void test3() {
        assertEquals(0.125, solution1.probabilityOfHeads(new double[]{0.5, 0.25}, 2));
    }

    @Test
    public void test4() {
        assertEquals(0.21875, solution1.probabilityOfHeads(new double[]{0.5, 0.25, 0.25}, 2));
    }

    @Test
    public void test5() {
        assertEquals(0.375, solution1.probabilityOfHeads(new double[]{0.5, 0.5, 0.5, 0.5}, 2));
    }

    @Test
    public void test6() {
        assertEquals(0.31250, solution1.probabilityOfHeads(new double[]{0.5, 0.5, 0.5, 0.5, 0.5, 0.5}, 3));
    }

}
