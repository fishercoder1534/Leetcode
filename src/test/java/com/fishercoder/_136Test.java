package com.fishercoder;

import com.fishercoder.solutions._136;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _136Test {
    private static _136.Solution1 solution1;
    private static _136.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _136.Solution1();
        solution2 = new _136.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, (solution1.singleNumber(new int[]{2, 2, 1})));
        assertEquals(1, (solution2.singleNumber(new int[]{2, 2, 1})));
    }

}