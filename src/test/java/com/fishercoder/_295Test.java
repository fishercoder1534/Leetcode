package com.fishercoder;

import com.fishercoder.solutions._295;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/27/17.
 */
public class _295Test {
    private static _295.MedianFinder_verbose test;

    @BeforeClass
    public static void setup(){
        test = new _295.MedianFinder_verbose();
    }

    @Test
    public void test1(){
        test.addNum(1);
        test.addNum(3);
        test.addNum(-1);
        assertEquals(1.0, test.findMedian(), 0);
    }
}
