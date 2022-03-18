package com.fishercoder;

import com.fishercoder.solutions._334;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _334Test {
    private static _334.Solution1 solution1;
    private static _334.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _334.Solution1();
        solution2 = new _334.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertEquals(true, solution2.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertEquals(false, solution2.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.increasingTriplet(new int[]{1, 1, -2, 6}));
        assertEquals(false, solution2.increasingTriplet(new int[]{1, 1, -2, 6}));
    }

}
