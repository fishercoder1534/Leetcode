package com.fishercoder;

import com.fishercoder.solutions._656;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/25/17.
 */
public class _656Test {
    private static _656.Solution1 solution1;
    private static int[] A;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _656.Solution1();
    }

    @Test
    public void test1() {
        A = new int[]{1, 2, 4, -1, 2};
        expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        assertEquals(expected, solution1.cheapestJump(A, 2));
    }
}
