package com.fishercoder;

import com.fishercoder.solutions._650;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 7/30/17.
 */
public class _650Test {
    private static _650 test;

    @BeforeClass
    public static void setup(){
        test = new _650();
    }

    @Test
    public void test1(){
        assertEquals(3, test.minSteps(3));
    }

    @Test
    public void test2(){
        assertEquals(9, test.minSteps(20));
    }

    @Test
    public void test3(){
        assertEquals(19, test.minSteps(19));
    }

    @Test
    public void test4(){
        assertEquals(0, test.minSteps(1));
    }

    @Test
    public void test5(){
        assertEquals(35, test.minSteps(741));
    }
}
