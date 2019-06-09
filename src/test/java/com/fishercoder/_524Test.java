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
    private static _524.Solution1 solution1;
    private static String expected;
    private static String actual;
    private static String s;
    private static ArrayList d;

    @BeforeClass
    public static void setup() {
        solution1 = new _524.Solution1();
    }

    @Test
    public void test1() {
        d = new ArrayList(Arrays.asList("ale", "apple", "monkey", "plea"));
        s = "abpcplea";
        expected = "apple";
        actual = solution1.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        d = new ArrayList(Arrays.asList("a", "b", "c"));
        s = "abpcplea";
        expected = "a";
        actual = solution1.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        d = new ArrayList(Arrays.asList("apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf"));
        s = "aewfafwafjlwajflwajflwafj";
        expected = "ewaf";
        actual = solution1.findLongestWord(expected, d);
        assertEquals(expected, actual);
    }
}
