package com.fishercoder;

import com.fishercoder.solutions._1726;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1726Test {
    private static _1726.Solution1 solution1;
    private static _1726.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1726.Solution1();
        solution2 = new _1726.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.tupleSameProduct(new int[]{2, 3, 4, 6}));
    }

    @Test
    public void test2() {
        assertEquals(16, solution1.tupleSameProduct(new int[]{1, 2, 4, 5, 10}));
    }

    @Test
    public void test3() {
        assertEquals(40, solution1.tupleSameProduct(new int[]{2, 3, 4, 6, 8, 12}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.tupleSameProduct(new int[]{2, 3, 5, 7}));
    }

    @Test
    public void test5() {
        assertEquals(128, solution1.tupleSameProduct(new int[]{1, 2, 3, 4, 6, 8, 12, 24}));
    }

    @Test
    public void test6() {
        assertEquals(40, solution2.tupleSameProduct(new int[]{2, 3, 4, 6, 8, 12}));
    }
}
