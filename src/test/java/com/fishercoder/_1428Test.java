package com.fishercoder;

import com.fishercoder.common.classes.BinaryMatrix;
import com.fishercoder.common.classes.BinaryMatrixImpl;
import com.fishercoder.solutions._1428;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1428Test {
    private static _1428.Solution1 solution1;
    private static BinaryMatrix binaryMatrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _1428.Solution1();
    }

    @Test
    public void test1() {
        binaryMatrix = new BinaryMatrixImpl(new int[][]{
                {0, 0},
                {1, 1}
        });
        assertEquals(0, solution1.leftMostColumnWithOne(binaryMatrix));
    }

}