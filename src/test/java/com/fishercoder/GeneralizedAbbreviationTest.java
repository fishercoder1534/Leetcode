package com.fishercoder;

import com.fishercoder.solutions.GeneralizedAbbreviation;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by fishercoder on 2/10/17.
 */
public class GeneralizedAbbreviationTest {
    private static GeneralizedAbbreviation test;
    private static List<String> expected;
    private static List<String> actual;
    private static String word;

    @BeforeClass
    public static void setup(){
        test = new GeneralizedAbbreviation();
    }

    @Before
    public void setupForEachTest(){
        expected = new ArrayList<>();
        actual = new ArrayList<>();
    }

    @Test
    public void test1(){
        word = "word";
        expected = Arrays.asList("word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4");
        actual = test.generateAbbreviations(word);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
