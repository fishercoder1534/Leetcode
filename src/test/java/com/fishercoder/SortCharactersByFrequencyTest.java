package com.fishercoder;

import com.fishercoder.solutions.SortCharactersByFrequency;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class SortCharactersByFrequencyTest {
    private static SortCharactersByFrequency test;
    private static String expected;
    private static String actual;
    private static String input;

    @BeforeClass
    public static void setup(){
        test = new SortCharactersByFrequency();
    }

    @Before
    public void setupForEachTest(){
        expected = "";
        actual = "";
    }

    @Test
    public void test1(){
        input = "tree";
        expected = "eert";
        actual = test.frequencySort(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        input = "cccaaa";
        expected = "aaaccc";
        actual = test.frequencySort(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        input = "Aabb";
        expected = "bbAa";
        actual = test.frequencySort(input);
        assertEquals(expected, actual);
    }
}
