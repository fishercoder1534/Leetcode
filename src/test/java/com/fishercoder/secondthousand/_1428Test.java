package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.BinaryMatrix;
import com.fishercoder.common.classes.BinaryMatrixImpl;
import com.fishercoder.solutions.secondthousand._1428;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1428Test {
    private _1428.Solution1 solution1;
    private static BinaryMatrix binaryMatrix;

    @BeforeEach
    public void setup() {
        solution1 = new _1428.Solution1();
    }

    @Test
    public void test1() {
        binaryMatrix =
                new BinaryMatrixImpl(
                        new int[][] {
                            {0, 0},
                            {1, 1}
                        });
        assertEquals(0, solution1.leftMostColumnWithOne(binaryMatrix));
    }
}
