package com.fishercoder;

import com.fishercoder.solutions._57;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _57Test {
    private static _57.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _57.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(new int[][]{
                {1, 5},
                {6, 9}
        }, solution1.insert(new int[][]{
                {1, 3},
                {6, 9}
        }, new int[]{2, 5}));
    }


    @Test
    public void test2() {
        assertEquals(new int[][]{
                {1, 2},
                {3, 10},
                {12, 16}
        }, solution1.insert(new int[][]{
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        }, new int[]{4, 9}));
    }
}
