package com.fishercoder;

import com.fishercoder.solutions._1343;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1343Test {
    private static _1343.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1343.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }

}