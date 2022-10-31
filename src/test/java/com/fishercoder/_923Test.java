package com.fishercoder;

import com.fishercoder.solutions._923;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _923Test {
    private static _923.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _923.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(20, solution1.threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
    }
}
