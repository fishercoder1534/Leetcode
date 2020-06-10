package com.fishercoder;

import com.fishercoder.solutions._1422;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1422Test {
    private static _1422.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1422.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.maxScore("011101"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.maxScore("00111"));
    }

}