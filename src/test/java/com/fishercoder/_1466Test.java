package com.fishercoder;

import com.fishercoder.solutions._1466;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1466Test {
    private static _1466.Solution1 solution1;
    private static int[][] connections;

    @BeforeClass
    public static void setup() {
        solution1 = new _1466.Solution1();
    }

    @Test
    public void test1() {
        connections = new int[][]{
                {0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}
        };
        assertEquals(3, solution1.minReorder(6, connections));
    }

}