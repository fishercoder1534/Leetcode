package com.fishercoder;

import com.fishercoder.solutions._600;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/28/17.
 */
public class _600Test {
    private static _600.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _600.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.findIntegers(5));
        assertEquals(514229, solution1.findIntegers(100000000));
    }
}
