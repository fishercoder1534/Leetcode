package com.fishercoder;

import com.fishercoder.solutions._306;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/27/17.
 */
public class _306Test {
    private static _306 test;
    private static String num;

    @BeforeClass
    public static void setup(){
        test = new _306();
    }

    @Test
    public void test1(){
        num = "0235813";
        assertEquals(false, test.isAdditiveNumber(num));
    }

    @Test
    public void test2(){
        num = "000";
        assertEquals(true, test.isAdditiveNumber(num));
    }

    @Test
    public void test3(){
        num = "011235";
        assertEquals(true, test.isAdditiveNumber(num));
    }
}
