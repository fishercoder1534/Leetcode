package com.fishercoder;

import com.fishercoder.solutions._7;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _7Test {
    private static _7.Solution1 solution1;
    private static _7.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _7.Solution1();
        solution2 = new _7.Solution2();
    }

    @Test
    public void test1() {
        /**its reversed number is greater than Integer.MAX_VALUE, thus return 0*/
        assertEquals(0, solution1.reverse(1534236469));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(1534236469);
        System.out.println(Integer.MAX_VALUE - 1534236469);
    }

    @Test
    public void test2() {
        assertEquals(0, solution2.reverse(1534236469));
    }

    @Test
    public void test3() {
        assertEquals(-123, solution2.reverse(-321));
    }

}