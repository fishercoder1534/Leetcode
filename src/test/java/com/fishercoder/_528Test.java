package com.fishercoder;

import com.fishercoder.solutions._528;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _528Test {
    private static _528.Solution1 solution1;
    private static int expected;

    @Test
    public void test1() {
        solution1 = new _528.Solution1(new int[]{1});
        expected = 0;
        assertEquals(expected, solution1.pickIndex());
    }

    @Test
    public void test2() {
        solution1 = new _528.Solution1(new int[]{1, 3});
        System.out.println(solution1.pickIndex());
        System.out.println(solution1.pickIndex());
        System.out.println(solution1.pickIndex());
        System.out.println(solution1.pickIndex());
        System.out.println(solution1.pickIndex());
    }

}
