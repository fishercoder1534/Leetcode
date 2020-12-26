package com.fishercoder;

import com.fishercoder.solutions._1700;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1700Test {
    private static _1700.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1700.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

}