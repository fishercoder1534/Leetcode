package com.fishercoder;

import com.fishercoder.solutions._1013;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1013Test {
    private static _1013.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1013.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

}