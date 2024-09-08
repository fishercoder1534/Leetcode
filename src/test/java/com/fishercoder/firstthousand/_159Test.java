package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._159;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _159Test {
    private _159.Solution1 solution1;
    private _159.Solution2 solution2;
    private static String s;
    private static int expected;

    @BeforeEach
    public void setup() {
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
