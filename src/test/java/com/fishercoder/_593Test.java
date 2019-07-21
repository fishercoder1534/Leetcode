package com.fishercoder;

import com.fishercoder.solutions._593;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/22/17.
 */
public class _593Test {
    private static _593.Solution1 solution1;
    private static int[] p1;
    private static int[] p2;
    private static int[] p3;
    private static int[] p4;

    @BeforeClass
    public static void setup() {
        solution1 = new _593.Solution1();
    }

    @Test
    public void test1() {
        p1 = new int[]{0, 0};
        p2 = new int[]{1, 1};
        p3 = new int[]{1, 0};
        p4 = new int[]{0, 1};
        assertEquals(true, solution1.validSquare(p1, p2, p3, p4));
    }

    @Test
    public void test2() {
        p1 = new int[]{1, 1};
        p2 = new int[]{5, 3};
        p3 = new int[]{3, 5};
        p4 = new int[]{7, 7};
        assertEquals(false, solution1.validSquare(p1, p2, p3, p4));
    }

    @Test
    public void test3() {
        p1 = new int[]{0, 0};
        p2 = new int[]{0, 0};
        p3 = new int[]{0, 0};
        p4 = new int[]{0, 0};
        System.out.println(solution1.noDuplicate(p1, p2, p3, p4));
        assertEquals(false, solution1.validSquare(p1, p2, p3, p4));
    }
}
