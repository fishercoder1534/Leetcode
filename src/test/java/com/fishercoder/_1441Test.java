package com.fishercoder;

import com.fishercoder.solutions._1441;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1441Test {
    private static _1441.Solution1 solution1;
    private static int[] target;

    @BeforeClass
    public static void setup() {
        solution1 = new _1441.Solution1();
    }

    @Test
    public void test1() {
        target = new int[]{1, 3};
        assertEquals(Arrays.asList("Push", "Push", "Pop", "Push"), solution1.buildArray(target, 3));
    }

}