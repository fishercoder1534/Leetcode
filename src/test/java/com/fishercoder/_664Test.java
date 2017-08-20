package com.fishercoder;

import com.fishercoder.solutions._664;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _664Test {
    private static _664 test;

    @BeforeClass
    public static void setup(){
        test = new _664();
    }

    @Test
    public void test1(){
        assertEquals(2, test.strangePrinter("aaabbb"));
    }

    @Test
    public void test2(){
        assertEquals(2, test.strangePrinter("aba"));
    }

}
