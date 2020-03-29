package com.fishercoder;

import com.fishercoder.solutions._1394;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1394Test {

    private static _1394.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1394.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findLucky(new int[]{2, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.findLucky(new int[]{2, 2, 2, 3, 3}));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution1.findLucky(new int[]{5}));
    }


}