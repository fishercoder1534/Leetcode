package com.fishercoder;

import com.fishercoder.solutions._518;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _518Test {
    private static _518.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _518.Solution1();
    }

    @Test
    public void test1() {
        int amount = 5;
        int[] coins = new int[] {1, 2, 5};
        int expected = 4;
        int actual = solution1.change(amount, coins);
        assertEquals(expected, actual);
    }
}
