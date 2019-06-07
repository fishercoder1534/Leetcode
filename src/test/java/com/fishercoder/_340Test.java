package com.fishercoder;

import com.fishercoder.solutions._340;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _340Test {
    private static _340.Solution1 solution1;
    private static _340.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _340.Solution1();
        solution2 = new _340.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.lengthOfLongestSubstringKDistinct("eceba", 2));
        assertEquals(3, solution2.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.lengthOfLongestSubstringKDistinct("", 0));
        assertEquals(0, solution2.lengthOfLongestSubstringKDistinct("", 0));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.lengthOfLongestSubstringKDistinct("a", 0));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.lengthOfLongestSubstringKDistinct("a", 1));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.lengthOfLongestSubstringKDistinct("a", 2));
    }

    @Test
    public void test6() {
        assertEquals(2, solution1.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    @Test
    public void test7() {
        assertEquals(3, solution1.lengthOfLongestSubstringKDistinct("bacc", 2));
    }

}
