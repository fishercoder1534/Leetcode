package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._202;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _202Test {
    private static _202.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _202.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isHappy(7));
    }
}
