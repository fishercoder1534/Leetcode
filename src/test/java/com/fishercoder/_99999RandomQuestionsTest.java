package com.fishercoder;

import com.fishercoder.solutions._99999RandomQuestions;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 9/7/17.
 */
public class _99999RandomQuestionsTest {
    private static _99999RandomQuestions test;
    private static _99999RandomQuestions.LongestRepeatedSubstring longestRepeatedSubstring;

    @BeforeClass
    public static void setup() {
        test = new _99999RandomQuestions();
        longestRepeatedSubstring = new _99999RandomQuestions.LongestRepeatedSubstring();
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

}
