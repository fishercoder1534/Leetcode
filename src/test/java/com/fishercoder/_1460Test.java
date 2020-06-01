package com.fishercoder;

import com.fishercoder.solutions._1460;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1460Test {
    private static _1460.Solution1 solution1;
    private static int[] target;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1460.Solution1();
    }

    @Test
    public void test1() {
        target = new int[]{1, 2, 3, 4};
        arr = new int[]{2, 4, 1, 3};
        assertEquals(true, solution1.canBeEqual(target, arr));
    }

}