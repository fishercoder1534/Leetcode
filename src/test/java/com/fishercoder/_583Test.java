package com.fishercoder;

import com.fishercoder.solutions._583;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/18/17.
 */
public class _583Test {
    private static _583 test;
    private static String word1;
    private static String word2;

    @BeforeClass
    public static void setup(){
        test = new _583();
    }

    @Test
    public void test1(){
        word1 = "sea";
        word2 = "eat";
        assertEquals(2, test.minDistance(word1, word2));
    }

    @Test
    public void test2(){
        word1 = "sea";
        word2 = "ate";
        assertEquals(4, test.minDistance(word1, word2));
    }
}
