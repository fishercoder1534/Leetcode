package com.fishercoder;

import com.fishercoder.solutions._60;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _60Test {
    private static _60.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _60.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("231", solution1.getPermutation(3, 4));
    }
}
