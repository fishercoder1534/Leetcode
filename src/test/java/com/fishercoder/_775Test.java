package com.fishercoder;

import com.fishercoder.solutions._775;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _775Test {
    private static _775.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _775.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isIdealPermutation(new int[]{0, 1}));
    }

}