package com.fishercoder;

import com.fishercoder.solutions._474;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _474Test {
    private static _474.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _474.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
    }

}
