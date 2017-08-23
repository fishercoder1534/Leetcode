package com.fishercoder;

import com.fishercoder.solutions._600;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/28/17.
 */
public class _600Test {
    private static _600 test;
    private static _600.DPSolution dpSolution;

    @BeforeClass
    public static void setup() {
        test = new _600();
        dpSolution = new _600.DPSolution();
    }

    @Test
    public void test1() {
        assertEquals(5, dpSolution.findIntegers(5));
        assertEquals(514229, dpSolution.findIntegers(100000000));

        assertEquals(5, test.findIntegers(5));
        assertEquals(514229, test.findIntegers(100000000));//this takes too long when using brute force
    }
}
