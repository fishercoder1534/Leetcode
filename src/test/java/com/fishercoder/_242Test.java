package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._242;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _242Test {
    private static _242.Solution1 solution1;
    private static _242.Solution2 solution2;
    private static _242.Solution3 solution3;
    private static String s;
    private static String t;

    @BeforeClass
    public static void setup() {
        solution1 = new _242.Solution1();
        solution2 = new _242.Solution2();
        solution3 = new _242.Solution3();
    }

    @Test
    public void test1() {
        s = "anagram";
        t = "nagaram";
        assertEquals(true, solution1.isAnagram(s, t));
        assertEquals(true, solution2.isAnagram(s, t));
    }

    @Test
    public void test2() {
        s = "代码写开心";
        t = "开心写代码";
        assertEquals(true, solution1.isAnagram(s, t));
        //assertEquals(true, solution3.isAnagram(s, t));//solution2 won't work for unicode character input
        assertEquals(true, solution3.isAnagram(s, t));
    }

}