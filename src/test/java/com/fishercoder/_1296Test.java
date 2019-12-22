package com.fishercoder;

import com.fishercoder.solutions._1296;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1296Test {
    private static _1296.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1296.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isPossibleDivide(new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isPossibleDivide(new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isPossibleDivide(new int[]{3, 3, 2, 2, 1, 1}, 3));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isPossibleDivide(new int[]{1, 2, 3, 4}, 3));
    }

}