package com.fishercoder;

import com.fishercoder.solutions._668;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _668Test {
    private static _668.Solution1 solution1;
    private static _668.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _668.Solution1();
        solution2 = new _668.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.findKthNumber(3, 3, 5));
        assertEquals(3, solution2.findKthNumber(3, 3, 5));
    }

    @Test
    public void test2() {
        assertEquals(6, solution1.findKthNumber(2, 3, 6));
        assertEquals(6, solution2.findKthNumber(2, 3, 6));
    }

    @Test
    public void test3() {
//        assertEquals(31666344, solution1.findKthNumber(9895, 28405, 100787757));//this will run into OOM error, so comment out
        assertEquals(31666344, solution2.findKthNumber(9895, 28405, 100787757));
    }

}