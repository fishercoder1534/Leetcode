package com.fishercoder;

import com.fishercoder.solutions._319;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/6/17.
 */
public class _319Test {
    private static _319 test;

    @BeforeClass
    public static void setup() {
        test = new _319();
    }

    @Test
    public void test1() {
        assertEquals(1, test.bulbSwitch(2));
    }

    @Test
    public void test2() {
        assertEquals(1, test.bulbSwitch(3));
    }

    @Test
    public void test3() {
        assertEquals(2, test.bulbSwitch(4));
    }

    @Test
    public void test4() {
        assertEquals(2, test.bulbSwitch(5));
    }

    @Test
    public void test5() {
        assertEquals(2, test.bulbSwitch(6));
    }

    @Test
    public void test6() {
        assertEquals(2, test.bulbSwitch(7));
    }

    @Test
    public void test7() {
        assertEquals(2, test.bulbSwitch(8));
    }

    @Test
    public void test8() {
        assertEquals(3, test.bulbSwitch(9));
    }

    @Test
    public void test11() {
        assertEquals(3, test.bulbSwitch(15));
    }

    @Test
    public void test9() {
        assertEquals(4, test.bulbSwitch(17));
    }

    @Test
    public void test10() {
        assertEquals(4, test.bulbSwitch(16));
    }


}
