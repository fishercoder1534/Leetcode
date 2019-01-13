package com.fishercoder;

import com.fishercoder.solutions._973;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _973Test {
    private static _973.Solution1 test;

    @BeforeClass
    public static void setUp() {
        test = new _973.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{-2, 2}}, test.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{3, 3},{-2, 4}}, test.kClosest(new int[][]{{3, 3},{5, -1},{-2, 4}}, 2));
    }
}
