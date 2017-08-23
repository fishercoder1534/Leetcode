package com.fishercoder;

import com.fishercoder.solutions._524;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 4/30/17.
 */
public class _524Test {
    private static _524 test;
    private static String expected;
    private static String actual;
    private static String s;
    private static ArrayList d;

    @BeforeClass
    public static void setup() {
        test = new _524();
    }

    @Test
    public void test1() {
        d = new ArrayList(Arrays.asList("ale", "apple", "monkey", "plea"));
        s = "abpcplea";
        expected = "apple";
        actual = test.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        d = new ArrayList(Arrays.asList("a", "b", "c"));
        s = "abpcplea";
        expected = "a";
        actual = test.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        d = new ArrayList(Arrays.asList("apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf"));
        s = "aewfafwafjlwajflwajflwafj";
        expected = "ewaf";
        actual = test.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }
}
