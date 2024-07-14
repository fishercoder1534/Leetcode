package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._875;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _875Test {
    private static _875.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _875.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    public void test2() {
        assertEquals(30, solution1.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    public void test3() {
        assertEquals(23, solution1.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.minEatingSpeed(new int[]{2, 2}, 2));
    }

    @Test
    public void test5() {
        assertEquals(2, solution1.minEatingSpeed(new int[]{312884470}, 312884469));
    }

    @Test
    public void test6() {
        assertEquals(500000000, solution1.minEatingSpeed(new int[]{1000000000}, 2));
    }

    @Test
    public void test7() {
        assertEquals(1, solution1.minEatingSpeed(new int[]{312884470}, 968709470));
    }

    @Test
    public void test8() {
        assertEquals(3, solution1.minEatingSpeed(new int[]{805306368, 805306368, 805306368}, 1000000000));
    }

}