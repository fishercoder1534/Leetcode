package com.fishercoder;

import com.fishercoder.solutions._87;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/4/17.
 */
public class _87Test {
    private static _87 test;

    @BeforeClass
    public static void setup(){
        test = new _87();
    }

    @Test
    public void test1(){
        assertEquals(true, test.isScramble("great", "rgeat"));
    }

    @Test
    public void test2(){
        assertEquals(true, test.isScramble("great", "rgtae"));
    }

    @Test
    public void test3(){
        assertEquals(true, test.isScramble("abc", "bca"));
    }

}
