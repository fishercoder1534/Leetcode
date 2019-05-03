package com.fishercoder;

import com.fishercoder.solutions._475;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 4/23/17.
 */
public class _475Test {
    private static _475.Solution1 test;
    private static int expected;
    private static int actual;
    private static int[] houses;
    private static int[] heaters;

    @BeforeClass
    public static void setup() {
        test = new _475.Solution1();
    }

    @Test
    public void test1() {
        houses = new int[]{1, 2, 3};
        heaters = new int[]{2};
        expected = 1;
        actual = test.findRadius(houses, heaters);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        houses = new int[]{1, 2, 3, 4};
        heaters = new int[]{1, 4};
        expected = 1;
        actual = test.findRadius(houses, heaters);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        houses = new int[]{1};
        heaters = new int[]{1, 2, 3, 4};
        expected = 0;
        actual = test.findRadius(houses, heaters);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        houses = new int[]{1, 2, 3, 5, 15};
        heaters = new int[]{2, 30};
        expected = 13;
        actual = test.findRadius(houses, heaters);
        assertEquals(expected, actual);
    }
}
