package com.fishercoder;

import com.fishercoder.solutions._2116;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2116Test {
    private static _2116.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2116.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canBeValid("))()))", "010100"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.canBeValid("()()", "0000"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.canBeValid(")", "0"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.canBeValid(")(", "00"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(", "100011110110011011010111100111011101111110000101001101001111"));
    }

}
