package com.fishercoder;

import com.fishercoder.solutions._904;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _904Test {
    private static _904.Solution1 solution1;
    private static int[] tree;

    @BeforeClass
    public static void setup() {
        solution1 = new _904.Solution1();
    }

    @Test
    public void test1() {
        tree = new int[]{1, 2, 1};
        assertEquals(3, solution1.totalFruit(tree));
    }

    @Test
    public void test2() {
        tree = new int[]{0, 1, 2, 2};
        assertEquals(3, solution1.totalFruit(tree));
    }

    @Test
    public void test3() {
        tree = new int[]{1, 2, 3, 2, 2};
        assertEquals(4, solution1.totalFruit(tree));
    }

    @Test
    public void test4() {
        tree = new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        assertEquals(5, solution1.totalFruit(tree));
    }

    @Test
    public void test5() {
        tree = new int[]{0, 1, 6, 6, 4, 4, 6};
        assertEquals(5, solution1.totalFruit(tree));
    }
}
