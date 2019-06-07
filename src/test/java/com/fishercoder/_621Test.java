package com.fishercoder;

import com.fishercoder.solutions._621;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _621Test {
    private static _621.Solution1 solution1;
    private static char[] tasks;

    @BeforeClass
    public static void setup() {
        solution1 = new _621.Solution1();
    }

    @Test
    public void test1() {
        tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        assertEquals(8, solution1.leastInterval(tasks, 2));
    }
}
