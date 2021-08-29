package com.fishercoder;

import com.fishercoder.solutions._1985;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1985Test {
    private static _1985.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1985.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("3", solution1.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4));
    }

    @Test
    public void test2() {
        assertEquals("6", solution1.kthLargestNumber(new String[]{"3", "6", "7", "10", "8", "1", "5"}, 4));
    }

}