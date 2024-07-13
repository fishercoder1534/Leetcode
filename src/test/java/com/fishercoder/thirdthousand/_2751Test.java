package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2751;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2751Test {
    private static _2751.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2751.Solution1();
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2, 17, 9, 15, 10), solution1.survivedRobotsHealths(new int[]{5, 4, 3, 2, 1}, new int[]{2, 17, 9, 15, 10}, "RRRRR"));
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(10), solution1.survivedRobotsHealths(new int[]{1, 40}, new int[]{10, 11}, "RL"));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(1, 38), solution1.survivedRobotsHealths(new int[]{17, 24, 18}, new int[]{1, 39, 30}, "LLR"));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(36), solution1.survivedRobotsHealths(new int[]{34, 50, 42, 2}, new int[]{6, 27, 17, 38}, "LLRR"));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(18), solution1.survivedRobotsHealths(new int[]{11, 44, 16}, new int[]{1, 20, 17}, "RLR"));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(20, 16, 50), solution1.survivedRobotsHealths(new int[]{31, 24, 30, 19, 33}, new int[]{22, 6, 18, 16, 50}, "LRRLR"));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(1, 37, 24), solution1.survivedRobotsHealths(new int[]{31, 27, 15, 28, 14, 8, 9, 49, 25}, new int[]{8, 19, 1, 6, 38, 24, 13, 38, 37}, "LRLRLLRLR"));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList(35), solution1.survivedRobotsHealths(new int[]{22, 19, 2, 43, 15, 34, 42, 1, 23, 31, 37, 35, 16, 36, 10}, new int[]{8, 26, 44, 35, 6, 33, 46, 42, 21, 34, 13, 31, 30, 12, 39}, "RRRRLLLRLRRLLLL"));
    }


}