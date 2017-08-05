package com.fishercoder;

import com.fishercoder.solutions._17;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _17Test {
    private static _17 test;
    private static String digits;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeClass
    public static void setup(){
        test = new _17();
    }

    @Test
    public void test1(){
        digits = "2";
        actual = test.letterCombinations(digits);
        expected = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        digits = "23";
        actual = test.letterCombinations(digits);
        expected = new ArrayList<>(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        /**order doesn't matter, so we check like below*/
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
