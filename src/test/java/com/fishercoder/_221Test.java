package com.fishercoder;

import com.fishercoder.solutions._221;
import com.fishercoder.solutions._50;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _221Test {
    private static _221.Solution1 solution1;
    private static char[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _221.Solution1();
    }

    @Test
    public void test1() {
        matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
        };

        assertEquals(4, solution1.maximalSquare(matrix));
    }
}
