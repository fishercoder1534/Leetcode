package com.fishercoder;

import com.fishercoder.solutions._1524;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1524Test {
    private static _1524.Solution1 solution1;
    private static _1524.Solution2 solution2;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1524.Solution1();
        solution2 = new _1524.Solution2();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 3, 5};
        assertEquals(4, solution1.numOfSubarrays(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{2, 4, 6};
        assertEquals(0, solution1.numOfSubarrays(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{1, 3, 5};
        assertEquals(4, solution2.numOfSubarrays(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{2, 4, 6};
        assertEquals(0, solution2.numOfSubarrays(arr));
    }

}