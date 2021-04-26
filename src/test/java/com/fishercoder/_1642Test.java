package com.fishercoder;

import com.fishercoder.solutions._1642;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1642Test {
    private static _1642.Solution1 solution1;

    @BeforeClass
    public static void setUp() {
        solution1 = new _1642.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));
    }

    @Test
    public void test2() {
        assertEquals(7, solution1.furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0));
    }

    @Test
    public void test4() {
        assertEquals(6, solution1.furthestBuilding(new int[]{17, 16, 5, 10, 10, 14, 7}, 74, 6));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.furthestBuilding(new int[]{7, 5, 13}, 0, 0));
    }

    @Test
    public void test6() {
        assertEquals(3, solution1.furthestBuilding(new int[]{2, 7, 9, 12}, 5, 1));
    }

}
