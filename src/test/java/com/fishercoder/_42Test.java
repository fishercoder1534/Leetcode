package com.fishercoder;

import com.fishercoder.solutions._42;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/13/17.
 */
public class _42Test {
    private static _42.Solution1 solution1;
    private static int[] height;

    @BeforeClass
    public static void setup() {
        solution1 = new _42.Solution1();
    }

    @Test
    public void test1() {
        height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution1.trap(height));
    }


}
