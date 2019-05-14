package com.fishercoder;

import com.fishercoder.solutions._492;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _492Test {
    private static _492.Solution1 solution1;
    private static int[] expected;
    private static int[] actual;
    private static int area;

    @BeforeClass
    public static void setup() {
        solution1 = new _492.Solution1();
    }

    @Before
    public void setupForEachTest() {
        expected = new int[]{0, 0};
        actual = new int[]{0, 0};
        area = 0;
    }

    @Test
    public void test1() {
        area = 4;
        expected = new int[]{2, 2};
        actual = solution1.constructRectangle(area);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        area = 3;
        expected = new int[]{3, 1};
        actual = solution1.constructRectangle(area);
        assertArrayEquals(expected, actual);
    }
}
