package com.fishercoder;

import com.fishercoder.solutions._1491;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1491Test {
    private static _1491.Solution1 solution1;
    private static int[] salary;

    @BeforeClass
    public static void setup() {
        solution1 = new _1491.Solution1();
    }

    @Test
    public void test1() {
        salary = new int[]{4000, 3000, 1000, 2000};
        assertEquals(2500.0000, solution1.average(salary));
    }

}