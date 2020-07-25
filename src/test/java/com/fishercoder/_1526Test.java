package com.fishercoder;

import com.fishercoder.solutions._1526;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1526Test {
    private static _1526.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1526.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minNumberOperations(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.minNumberOperations(new int[]{3, 1, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.minNumberOperations(new int[]{3, 1, 5, 4, 2}));
    }

}