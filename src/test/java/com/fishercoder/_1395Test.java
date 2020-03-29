package com.fishercoder;

import com.fishercoder.solutions._1395;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1395Test {
    private static _1395.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1395.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numTeams(new int[]{2, 5, 3, 4, 1}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numTeams(new int[]{2, 1, 3}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numTeams(new int[]{1, 2, 3, 4}));
    }

}
