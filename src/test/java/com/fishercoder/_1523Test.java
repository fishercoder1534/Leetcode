package com.fishercoder;

import com.fishercoder.solutions._1523;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1523Test {
    private static _1523.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1523.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countOdds(3, 7));
    }

}