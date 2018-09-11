package com.fishercoder;

import com.fishercoder.solutions._202;
import com.fishercoder.solutions._53;
import org.junit.Before;
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
