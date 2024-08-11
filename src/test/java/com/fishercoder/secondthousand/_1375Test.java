package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1375;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1375Test {
    private _1375.Solution1 solution1;
    private static int[] light;

    @BeforeEach
    public void setup() {
        solution1 = new _1375.Solution1();
    }

    @Test
    public void test1() {
        light = new int[]{2, 1, 3, 5, 4};
        assertEquals(3, solution1.numTimesAllBlue(light));
    }

    @Test
    public void test2() {
        light = new int[]{3, 2, 4, 1, 5};
        assertEquals(2, solution1.numTimesAllBlue(light));
    }

    @Test
    public void test3() {
        light = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(6, solution1.numTimesAllBlue(light));
    }

}