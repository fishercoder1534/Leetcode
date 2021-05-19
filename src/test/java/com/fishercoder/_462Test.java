package com.fishercoder;

import com.fishercoder.solutions._462;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _462Test {
    private static _462.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _462.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minMoves2(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minMoves2(new int[]{1}));
    }

}