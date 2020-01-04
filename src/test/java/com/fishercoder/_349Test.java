package com.fishercoder;

import com.fishercoder.solutions._349;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _349Test {
    private static _349.Solution1 solution1;
    private static _349.Solution2 solution2;
    private static _349.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _349.Solution1();
        solution2 = new _349.Solution2();
        solution3 = new _349.Solution3();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2}, solution1.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2}, solution2.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{2}, solution3.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}
