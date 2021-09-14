package com.fishercoder;

import com.fishercoder.solutions._849;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _849Test {

    private static _849.Solution1 solution1;
    private static _849.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _849.Solution1();
        solution2 = new _849.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        assertEquals(2, solution2.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.maxDistToClosest(new int[]{1, 0, 0, 0}));
        assertEquals(3, solution2.maxDistToClosest(new int[]{1, 0, 0, 0}));
    }
}
