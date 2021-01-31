package com.fishercoder;

import com.fishercoder.solutions._1718;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1718Test {
    private static _1718.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1718.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 1, 2, 3, 2}, solution1.constructDistancedSequence(3));
    }

}