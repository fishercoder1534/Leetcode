package com.fishercoder;

import com.fishercoder.solutions._1386;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1386Test {
    private static _1386.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1386.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxNumberOfFamilies(3, new int[][]{
                {1, 2},
                {1, 3},
                {1, 8},
                {2, 6},
                {3, 1},
                {3, 10},
        }));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.maxNumberOfFamilies(2, new int[][]{
                {2, 1},
                {1, 8},
                {2, 6},
        }));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.maxNumberOfFamilies(4, new int[][]{
                {4, 3},
                {1, 4},
                {4, 6},
                {1, 7},
        }));
    }

}