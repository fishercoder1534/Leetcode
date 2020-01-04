package com.fishercoder;

import com.fishercoder.solutions._350;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _350Test {
    private static _350.Solution1 solution1;
    private static _350.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _350.Solution1();
        solution2 = new _350.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, solution1.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 2}, solution2.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

}
