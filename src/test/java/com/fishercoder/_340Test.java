package com.fishercoder;

import com.fishercoder.solutions._340;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/10/17.
 */
public class _340Test {
    private static _340 test;

    @BeforeClass
    public static void setup() {
        test = new _340();
    }

    @Test
    public void test1() {
        assertEquals(3, test.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    public void test2() {
        assertEquals(0, test.lengthOfLongestSubstringKDistinct("", 0));
    }

    @Test
    public void test3() {
        assertEquals(0, test.lengthOfLongestSubstringKDistinct("a", 0));
    }

    @Test
    public void test4() {
        assertEquals(1, test.lengthOfLongestSubstringKDistinct("a", 1));
    }

    @Test
    public void test5() {
        assertEquals(1, test.lengthOfLongestSubstringKDistinct("a", 2));
    }

    @Test
    public void test6() {
        assertEquals(2, test.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    @Test
    public void test7() {
        assertEquals(3, test.lengthOfLongestSubstringKDistinct("bacc", 2));
    }

}
