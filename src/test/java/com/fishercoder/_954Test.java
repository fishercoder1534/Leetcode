package com.fishercoder;

import com.fishercoder.solutions._954;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _954Test {
    private static _954.Solution1 solution1;
    private static int[] A;

    @BeforeClass
    public static void setup() {
        solution1 = new _954.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{3, 1, 3, 6};
        assertEquals(false, solution1.canReorderDoubled(A));
    }

    @Test
    public void test2() {
        A = new int[]{2, 1, 2, 6};
        assertEquals(false, solution1.canReorderDoubled(A));
    }

    @Test
    public void test3() {
        A = new int[]{4, -2, 2, -4};
        assertEquals(true, solution1.canReorderDoubled(A));
    }

    @Test
    public void test4() {
        A = new int[]{1, 2, 4, 16, 8, 4};
        assertEquals(false, solution1.canReorderDoubled(A));
    }

    @Test
    public void test5() {
        A = new int[]{1, 2, 4, 8};
        assertEquals(true, solution1.canReorderDoubled(A));
    }

    @Test
    public void test6() {
        A = new int[]{10, 20, 40, 80};
        assertEquals(true, solution1.canReorderDoubled(A));
    }

    @Test
    public void test7() {
        A = new int[]{0, 0};
        assertEquals(true, solution1.canReorderDoubled(A));
    }
}
