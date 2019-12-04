package com.fishercoder;

import com.fishercoder.solutions._1184;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1184Test {
    private static _1184.Solution1 solution1;
    private static int[] distance;

    @BeforeClass
    public static void setup() {
        solution1 = new _1184.Solution1();
    }

    @Test
    public void test1() {
        distance = new int[]{1, 2, 3, 4};
        assertEquals(1, solution1.distanceBetweenBusStops(distance, 0, 1));
    }

    @Test
    public void test2() {
        distance = new int[]{1, 2, 3, 4};
        assertEquals(4, solution1.distanceBetweenBusStops(distance, 0, 3));
    }

    @Test
    public void test3() {
        distance = new int[]{1, 2, 3, 4};
        assertEquals(3, solution1.distanceBetweenBusStops(distance, 0, 2));
    }

    @Test
    public void test4() {
        distance = new int[]{7,10,1,12,11,14,5,0};
        assertEquals(17, solution1.distanceBetweenBusStops(distance, 7, 2));
    }

}