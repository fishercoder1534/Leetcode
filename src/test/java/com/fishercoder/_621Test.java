package com.fishercoder;

import com.fishercoder.solutions._621;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/19/17.
 */
public class _621Test {
    private static _621 test;
    private static char[] tasks;

    @BeforeClass
    public static void setup() {
        test = new _621();
    }

    @Test
    public void test1() {
        tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        assertEquals(8, test.leastInterval(tasks, 2));
    }
}
