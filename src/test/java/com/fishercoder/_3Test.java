package com.fishercoder;

import com.fishercoder.solutions._3;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _3Test {
    private static _3.Solution1 solution1;
    private static _3.Solution2 solution2;
    private static _3.Solution3 solution3;
    private static _3.Solution4 solution4;
    private static _3.Solution5 solution5;

    @BeforeClass
    public static void setup() {
        solution1 = new _3.Solution1();
        solution2 = new _3.Solution2();
        solution3 = new _3.Solution3();
        solution4 = new _3.Solution4();
        solution5 = new _3.Solution5();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution2.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution4.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution5.lengthOfLongestSubstring("abcabcbb"));
    }

}