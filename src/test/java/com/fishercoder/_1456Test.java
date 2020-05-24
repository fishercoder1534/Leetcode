package com.fishercoder;

import com.fishercoder.solutions._1456;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1456Test {
    private static _1456.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1456.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maxVowels("abciiidef", 3));
    }

}