package com.fishercoder;

import com.fishercoder.solutions._1450;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1450Test {
    private static _1450.Solution1 solution1;
    private static int[] startTime;
    private static int[] endTime;

    @BeforeClass
    public static void setup() {
        solution1 = new _1450.Solution1();
    }

    @Test
    public void test1() {
        startTime = new int[]{1, 2, 3};
        endTime = new int[]{3, 2, 7};
        assertEquals(1, solution1.busyStudent(startTime, endTime, 4));
    }

}