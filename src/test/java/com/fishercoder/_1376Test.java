package com.fishercoder;

import com.fishercoder.solutions._1376;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1376Test {
    private static _1376.Solution1 solution1;
    private static int[] manager;
    private static int[] informTime;

    @Test
    public void test1() {
        solution1 = new _1376.Solution1();
        manager = new int[]{-1};
        informTime = new int[]{0};
        assertEquals(0, solution1.numOfMinutes(1, 0, manager, informTime));
    }

    @Test
    public void test2() {
        solution1 = new _1376.Solution1();
        manager = new int[]{2, 2, -1, 2, 2, 2};
        informTime = new int[]{0, 0, 1, 0, 0, 0};
        assertEquals(1, solution1.numOfMinutes(6, 2, manager, informTime));
    }

    @Test
    public void test3() {
        solution1 = new _1376.Solution1();
        manager = new int[]{1, 2, 3, 4, 5, 6, -1};
        informTime = new int[]{0, 6, 5, 4, 3, 2, 1};
        assertEquals(21, solution1.numOfMinutes(7, 6, manager, informTime));
    }

    @Test
    public void test4() {
        solution1 = new _1376.Solution1();
        manager = new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        informTime = new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(3, solution1.numOfMinutes(15, 0, manager, informTime));
    }

    @Test
    public void test5() {
        solution1 = new _1376.Solution1();
        manager = new int[]{3, 3, -1, 2};
        informTime = new int[]{0, 0, 162, 914};
        assertEquals(1076, solution1.numOfMinutes(4, 2, manager, informTime));
    }

    @Test
    public void test6() {
        solution1 = new _1376.Solution1();
        manager = new int[]{5, 9, 6, 10, -1, 8, 9, 1, 9, 3, 4};
        informTime = new int[]{0, 213, 0, 253, 686, 170, 975, 0, 261, 309, 337};
        assertEquals(2560, solution1.numOfMinutes(11, 4, manager, informTime));
    }

}