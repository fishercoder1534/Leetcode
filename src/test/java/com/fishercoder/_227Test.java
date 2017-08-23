package com.fishercoder;

import com.fishercoder.solutions._227;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/29/17.
 */
public class _227Test {
    private static _227 test;

    @BeforeClass
    public static void setup() {
        test = new _227();
    }

    @Test
    public void test1() {
        assertEquals(7, test.calculate("3+2*2"));
    }

    @Test
    public void test2() {
        assertEquals(1, test.calculate(" 3/2 "));
    }

    @Test
    public void test3() {
        assertEquals(5, test.calculate(" 3+5 / 2 "));
    }

    @Test
    public void test4() {
        assertEquals(27, test.calculate("100000000/1/2/3/4/5/6/7/8/9/10"));
    }

}
