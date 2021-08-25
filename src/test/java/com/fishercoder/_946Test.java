package com.fishercoder;

import com.fishercoder.solutions._946;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _946Test {

    private static _946.Solution1 solution1;
    private static _946.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _946.Solution1();
        solution2 = new _946.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
        assertEquals(true, solution2.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
        assertEquals(false, solution2.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.validateStackSequences(new int[]{}, new int[]{}));
        assertEquals(true, solution2.validateStackSequences(new int[]{}, new int[]{}));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.validateStackSequences(new int[]{4, 0, 1, 2, 3}, new int[]{4, 2, 3, 0, 1}));
        assertEquals(false, solution2.validateStackSequences(new int[]{4, 0, 1, 2, 3}, new int[]{4, 2, 3, 0, 1}));
    }
}
