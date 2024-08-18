package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._340;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _340Test {
    private _340.Solution1 solution1;
    private _340.Solution2 solution2;
    private _340.Solution3 solution3;
    private static String s;
    private static int k;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _340.Solution1();
        solution2 = new _340.Solution2();
        solution3 = new _340.Solution3();
    }

    @Test
    public void test1() {
        s = "eceba";
        k = 2;
        expected = 3;
        assertEquals(expected, solution1.lengthOfLongestSubstringKDistinct(s, k));
        assertEquals(expected, solution2.lengthOfLongestSubstringKDistinct(s, k));
        assertEquals(expected, solution3.lengthOfLongestSubstringKDistinct(s, k));
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
