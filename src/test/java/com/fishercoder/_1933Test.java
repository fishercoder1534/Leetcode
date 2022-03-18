package com.fishercoder;

import com.fishercoder.solutions._1933;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1933Test {
    private static _1933.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1933.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isDecomposable("000111000"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isDecomposable("00011111222"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.isDecomposable("011100022233"));
    }

}
