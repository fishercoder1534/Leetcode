package com.fishercoder;

import com.fishercoder.solutions._326;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _326Test {
    private static _326.Solution1 solution1;
    private static _326.Solution2 solution2;
    private static _326.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _326.Solution1();
        solution2 = new _326.Solution2();
        solution3 = new _326.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPowerOfThree(12));
        assertEquals(false, solution2.isPowerOfThree(12));
        assertEquals(false, solution3.isPowerOfThree(12));
    }

}