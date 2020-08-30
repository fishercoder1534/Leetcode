package com.fishercoder;

import com.fishercoder.solutions._1566;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1566Test {
    private static _1566.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1566.Solution1();
    }


    @Test
    public void test1() {
        assertEquals(true, solution1.containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.containsPattern(new int[]{1, 2, 1, 2, 1, 3}, 2, 3));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.containsPattern(new int[]{1, 2, 3, 1, 2}, 2, 2));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3));
    }

    @Test
    public void test6() {
        assertEquals(false, solution1.containsPattern(new int[]{2, 2, 2, 2}, 2, 3));
    }

    @Test
    public void test7() {
        assertEquals(false, solution1.containsPattern(new int[]{2, 2, 1, 2, 2, 1, 1, 1, 2, 1}, 2, 2));
    }
}
