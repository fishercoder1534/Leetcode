package com.fishercoder;

import com.fishercoder.solutions._997;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _997Test {
    private static _997.Solution1 solution1;
    private static _997.Solution2 solution2;
    private static int[][] trust;

    @BeforeClass
    public static void setup() {
        solution1 = new _997.Solution1();
        solution2 = new _997.Solution2();
    }

    @Test
    public void test1() {
        trust = new int[][]{{1, 2}};
        assertEquals(2, solution1.findJudge(2, trust));
        assertEquals(2, solution2.findJudge(2, trust));
    }

    @Test
    public void test2() {
        trust = new int[][]{{1, 3}, {2, 3}};
        assertEquals(3, solution1.findJudge(3, trust));
    }

    @Test
    public void test3() {
        trust = new int[][]{{1, 2}, {2, 3}, {3, 1}};
        assertEquals(-1, solution1.findJudge(3, trust));
    }

    @Test
    public void test4() {
        trust = new int[][]{{1, 2}, {2, 3}};
        assertEquals(-1, solution1.findJudge(3, trust));
    }

    @Test
    public void test5() {
        trust = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        assertEquals(3, solution1.findJudge(4, trust));
    }

    @Test
    public void test6() {
        trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        assertEquals(-1, solution1.findJudge(3, trust));
    }
}
