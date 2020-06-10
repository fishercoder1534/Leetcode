package com.fishercoder;

import com.fishercoder.solutions._1427;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1427Test {
    private static _1427.Solution1 solution1;
    private static int[][] shift;

    @BeforeClass
    public static void setup() {
        solution1 = new _1427.Solution1();
    }

    @Test
    public void test1() {
        shift = new int[][]{
                {0, 1},
                {1, 2},
        };
        assertEquals("cab", solution1.stringShift("abc", shift));
    }

}