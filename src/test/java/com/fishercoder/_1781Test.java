package com.fishercoder;

import com.fishercoder.solutions._1781;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1781Test {
    private static _1781.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1781.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.beautySum("aabcb"));
    }

}