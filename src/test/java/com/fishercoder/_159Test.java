package com.fishercoder;

import com.fishercoder.solutions._159;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _159Test {
    private static _159.Solution1 solution1;
    private static _159.Solution2 solution2;
    private static String s;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _159.Solution1();
        solution2 = new _159.Solution2();
    }

    @Test
    public void test1() {
        s = "eceba";
        expected = 3;
        assertEquals(expected, solution1.lengthOfLongestSubstringTwoDistinct(s));
        assertEquals(expected, solution2.lengthOfLongestSubstringTwoDistinct(s));
    }


    @Test
    public void test2() {
        s = "ccaabbb";
        expected = 5;
        assertEquals(expected, solution1.lengthOfLongestSubstringTwoDistinct(s));
        assertEquals(expected, solution2.lengthOfLongestSubstringTwoDistinct(s));
    }

}
