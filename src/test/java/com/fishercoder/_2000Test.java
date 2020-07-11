package com.fishercoder;

import com.fishercoder.common.classes.BinaryMatrixImpl;
import com.fishercoder.solutions._2000;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2000Test {
    private static _2000.Solution1 solution1;
    private static BinaryMatrixImpl binaryMatrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _2000.Solution1();
    }

    @Test
    public void test1() {
        binaryMatrix = new BinaryMatrixImpl(new int[][]{
                {0, 0},
                {1, 1},
        });
        assertEquals(0, solution1.leftMostColumnWithOne(binaryMatrix));
    }

    @Test
    public void test2() {
        binaryMatrix = new BinaryMatrixImpl(new int[][]{
                {0, 0},
                {0, 1},
        });
        assertEquals(1, solution1.leftMostColumnWithOne(binaryMatrix));
    }

    @Test
    public void test3() {
        binaryMatrix = new BinaryMatrixImpl(new int[][]{
                {0, 0},
                {0, 0},
        });
        assertEquals(-1, solution1.leftMostColumnWithOne(binaryMatrix));
    }

    @Test
    public void test4() {
        binaryMatrix = new BinaryMatrixImpl(new int[][]{
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1}
        });
        assertEquals(1, solution1.leftMostColumnWithOne(binaryMatrix));
    }
}