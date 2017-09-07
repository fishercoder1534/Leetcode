package com.fishercoder;

import com.fishercoder.solutions._295;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/27/17.
 */
public class _295Test {
    private static _295.Solution1.MedianFinder solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _295.Solution1.MedianFinder();
    }

    @Test
    public void test1() {
        solution1.addNum(1);
        solution1.addNum(3);
        solution1.addNum(-1);
        assertEquals(1.0, solution1.findMedian(), 0);
    }
}
