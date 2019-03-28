package com.fishercoder;

import com.fishercoder.solutions._485;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _485Test {
    private static _485.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _485.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

}