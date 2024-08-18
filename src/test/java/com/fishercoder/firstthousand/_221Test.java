package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._221;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _221Test {
    private _221.Solution1 solution1;
    private static char[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _221.Solution1();
    }

    @Test
    public void test1() {
        matrix =
                new char[][] {
                    {'1', '0', '1', '0', '0'},
                    {'1', '0', '1', '1', '1'},
                    {'1', '1', '1', '1', '1'},
                    {'1', '0', '0', '1', '0'},
                };

        assertEquals(4, solution1.maximalSquare(matrix));
    }
}
