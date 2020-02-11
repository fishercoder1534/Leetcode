package com.fishercoder;

import com.fishercoder.solutions._1273;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1273Test {
    private static _1273.Solution1 solution1;
    private static int[] parent;
    private static int[] value;

    @BeforeClass
    public static void setup() {
        solution1 = new _1273.Solution1();
    }

    @Test
    public void test1() {
        parent = new int[]{-1, 0, 0, 1, 2, 2, 2};
        value = new int[]{1, -2, 4, 0, -2, -1, -1};
        assertEquals(2, solution1.deleteTreeNodes(7, parent, value));
    }

    @Test
    public void test2() {
        parent = new int[]{-1, 0, 0, 1, 2, 2, 2};
        value = new int[]{1, -2, 3, 0, -2, -1, 0};
        assertEquals(2, solution1.deleteTreeNodes(7, parent, value));
    }

    @Test
    public void test3() {
        parent = new int[]{-1, 0, 0, 1, 2, 2, 2};
        value = new int[]{1, -2, 4, 0, -2, -1, -2};
        assertEquals(6, solution1.deleteTreeNodes(7, parent, value));
    }

    @Test
    public void test4() {
        parent = new int[]{-1, 0, 0, 1, 2, 2, 2};
        value = new int[]{3, -2, 4, 0, -2, -1, -2};
        assertEquals(0, solution1.deleteTreeNodes(7, parent, value));
    }

}
