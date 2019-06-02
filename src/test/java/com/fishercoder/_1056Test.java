package com.fishercoder;

import com.fishercoder.solutions._1056;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1056Test {
    private static _1056.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1056.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.confusingNumber(6));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.confusingNumber(89));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.confusingNumber(11));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.confusingNumber(25));
    }

}