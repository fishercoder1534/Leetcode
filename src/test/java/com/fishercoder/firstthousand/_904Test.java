package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._904;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _904Test {
    private _904.Solution1 solution1;
    private static int[] fruits;

    @BeforeEach
    public void setup() {
        solution1 = new _904.Solution1();
    }

    @Test
    public void test1() {
        fruits = new int[]{1, 2, 1};
        assertEquals(3, solution1.totalFruit(fruits));
    }

    @Test
    public void test2() {
        fruits = new int[]{0, 1, 2, 2};
        assertEquals(3, solution1.totalFruit(fruits));
    }

    @Test
    public void test3() {
        fruits = new int[]{1, 2, 3, 2, 2};
        assertEquals(4, solution1.totalFruit(fruits));
    }

    @Test
    public void test4() {
        fruits = new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        assertEquals(5, solution1.totalFruit(fruits));
    }

    @Test
    public void test5() {
        fruits = new int[]{0, 1, 6, 6, 4, 4, 6};
        assertEquals(5, solution1.totalFruit(fruits));
    }

    @Test
    public void test6() {
        fruits = new int[]{0, 1, 1, 4, 3};
        assertEquals(3, solution1.totalFruit(fruits));
    }
}
