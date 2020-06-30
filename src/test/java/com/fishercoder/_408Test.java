package com.fishercoder;

import com.fishercoder.solutions._408;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _408Test {
    private static _408.Solution1 solution1;
    private static Boolean expected;
    private static Boolean actual;
    private static String word;
    private static String abbr;

    @BeforeClass
    public static void setup() {
        solution1 = new _408.Solution1();
    }

    @Before
    public void setupForEachTest() {
        word = "";
        abbr = "";
    }

    @Test
    public void test1() {
        word = "internationalization";
        abbr = "i12iz4n";
        expected = true;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        word = "apple";
        abbr = "a2e";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        word = "internationalization";
        abbr = "i5a11o1";
        expected = true;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        word = "hi";
        abbr = "1";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        word = "a";
        abbr = "1";
        expected = true;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        word = "a";
        abbr = "2";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        word = "hi";
        abbr = "1i";
        expected = true;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        word = "hi";
        abbr = "3";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        word = "hi";
        abbr = "11";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        word = "word";
        abbr = "1o1d";
        expected = true;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        word = "abbreviation";
        abbr = "a010n";
        expected = false;
        actual = solution1.validWordAbbreviation(word, abbr);
        assertEquals(expected, actual);
    }
}
