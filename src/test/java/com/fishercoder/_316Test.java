package com.fishercoder;

import com.fishercoder.solutions._316;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/2/17.
 */
public class _316Test {
    private static _316 test;

    @BeforeClass
    public static void setup(){
        test = new _316();
    }

    @Test
    public void test1(){
        assertEquals("abc", test.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void test2(){
        assertEquals("acdb", test.removeDuplicateLetters("cbacdcbc"));
    }
}
