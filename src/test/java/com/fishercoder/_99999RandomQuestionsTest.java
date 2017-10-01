package com.fishercoder;

import com.fishercoder.solutions._99999RandomQuestions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 9/7/17.
 */
public class _99999RandomQuestionsTest {
    private static _99999RandomQuestions test;
    private static _99999RandomQuestions.LongestRepeatedSubstring longestRepeatedSubstring;
    private static _99999RandomQuestions.RangeModule rangeModule;

    @BeforeClass
    public static void setup() {
        test = new _99999RandomQuestions();
        longestRepeatedSubstring = new _99999RandomQuestions.LongestRepeatedSubstring();
    }

    @Before
    public void cleanUpForEachTest() {
        rangeModule = new _99999RandomQuestions.RangeModule();
    }

    @Test
    public void test1() {
        assertEquals(true, test.isValid("()"));
    }

    @Test
    public void test2() {
        assertEquals(true, test.isValid("(*)"));
    }

    @Test
    public void test3() {
        assertEquals(true, test.isValid("(*))"));
    }

    @Test
    public void test4() {
        assertEquals(false, test.isValid(")("));
    }

    @Test
    public void test5() {
        assertEquals(false, test.isValid("(*()"));
    }

    @Test
    public void test6() {
        assertEquals(false, test.isValid("((*)"));
    }

    @Test
    public void test7() {
        assertEquals(true, test.isValid("((*)))"));
    }

    @Test
    public void test8() {
        assertEquals(true, test.isValid("()()"));
    }

    @Test
    public void test9() {
        assertEquals(true, test.isValid("(((())))"));
    }

    @Test
    public void test10() {
        assertEquals(true, test.isValid("(((******)))"));
    }

    @Test
    public void test11() {
        assertEquals(false, test.isValid("(((******))"));
    }

    @Test
    public void test12() {
        assertEquals(true, test.isValid("((*)****)"));
    }

    @Test
    public void test13() {
        assertEquals("aaaa", longestRepeatedSubstring.findLongestRepeatedSubstring("aaaaa"));
    }

//    @Test
//    public void test14() {
//        assertEquals("bc", longestRepeatedSubstring.findLongestRepeatedSubstring("abcbca"));
//    }

    @Test
    public void test15() {
        rangeModule.addRange(10, 180);
        rangeModule.addRange(150, 200);
        rangeModule.addRange(250, 500);
        assertEquals(true, rangeModule.queryRange(50, 100));
        assertEquals(false, rangeModule.queryRange(180, 300));
        assertEquals(false, rangeModule.queryRange(600, 1000));

        rangeModule.deleteRange(50, 150);
        assertEquals(false, rangeModule.queryRange(50, 100));
    }

    @Test
    public void test16() {
        rangeModule.addRange(10, 100);
        assertEquals(true, rangeModule.queryRange(10, 100));
        assertEquals(false, rangeModule.queryRange(5, 20));
        assertEquals(false, rangeModule.queryRange(0, 9));
        assertEquals(false, rangeModule.queryRange(1, 20));
    }

    @Test
    public void test17() {
        rangeModule.addRange(10, 100);
        assertEquals(true, rangeModule.queryRange(10, 100));

        rangeModule.deleteRange(25, 44);
        assertEquals(false, rangeModule.queryRange(10, 100));
        assertEquals(false, rangeModule.queryRange(10, 25));
        assertEquals(false, rangeModule.queryRange(44, 50));
        assertEquals(true, rangeModule.queryRange(10, 24));
        assertEquals(true, rangeModule.queryRange(50, 60));

        rangeModule.deleteRange(15, 50);
        assertEquals(false, rangeModule.queryRange(10, 24));
        assertEquals(false, rangeModule.queryRange(45, 100));
        assertEquals(true, rangeModule.queryRange(10, 14));
    }

    @Test
    public void test18() {
        rangeModule.addRange(10, 200);
        rangeModule.addRange(150, 180);
        rangeModule.addRange(250, 500);
        assertEquals(true, rangeModule.queryRange(50, 100));
        assertEquals(false, rangeModule.queryRange(180, 300));
        assertEquals(false, rangeModule.queryRange(600, 1000));

        rangeModule.deleteRange(50, 150);
        assertEquals(false, rangeModule.queryRange(50, 100));
    }
}
