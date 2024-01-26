package com.fishercoder;

import com.fishercoder.solutions._295;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/27/17.
 */
public class _295Test {
    private static _295.Solution1.MedianFinder solution1;
    private static _295.Solution2.MedianFinder solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _295.Solution1.MedianFinder();
        solution2 = new _295.Solution2.MedianFinder();
    }

    @Test
    public void test1() {
        solution1.addNum(1);
        solution1.addNum(3);
        solution1.addNum(-1);
        assertEquals(1.0, solution1.findMedian(), 0);
    }

    @Test
    public void test2() {
        solution2.addNum(1);
        solution2.addNum(3);
        solution2.addNum(-1);
        assertEquals(1.0, solution2.findMedian(), 0);
    }
}
