package com.fishercoder;

import com.fishercoder.solutions._1299;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1299Test {
    private static _1299.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1299.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{17, 18, 5, 4, 6, 1};
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution1.replaceElements(arr));
    }

}