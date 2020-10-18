package com.fishercoder;

import com.fishercoder.solutions._1626;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1626Test {
    private static _1626.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1626.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.bestTeamScore(new int[]{1, 2, 3, 5}, new int[]{8, 9, 10, 1}));
    }

    @Test
    public void test2() {
        assertEquals(34, solution1.bestTeamScore(new int[]{1, 3, 5, 10, 15}, new int[]{1, 2, 3, 4, 5}));
    }

}