package com.fishercoder;

import com.fishercoder.solutions._1652;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1652Test {
    private static _1652.Solution1 solution1;
    private static int[] code;

    @BeforeClass
    public static void setup() {
        solution1 = new _1652.Solution1();
    }

    @Test
    public void test1() {
        code = new int[]{5, 7, 1, 4};
        assertArrayEquals(new int[]{12, 10, 16, 13}, solution1.decrypt(code, 3));
    }

    @Test
    public void test2() {
        code = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution1.decrypt(code, 0));
    }

    @Test
    public void test3() {
        code = new int[]{2, 4, 9, 3};
        assertArrayEquals(new int[]{12, 5, 6, 13}, solution1.decrypt(code, -2));
    }

    @Test
    public void test4() {
        code = new int[]{10, 5, 7, 7, 3, 2, 10, 3, 6, 9, 1, 6};
        assertArrayEquals(new int[]{22, 26, 22, 28, 29, 22, 19, 22, 18, 21, 28, 19}, solution1.decrypt(code, -4));
    }

}