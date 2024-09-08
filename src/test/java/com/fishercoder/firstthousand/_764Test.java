package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._764;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _764Test {
    private _764.Solution1 solution1;
    private _764.Solution2 solution2;
    private static int[][] mines;

    @BeforeEach
    public void setup() {
        solution1 = new _764.Solution1();
        solution2 = new _764.Solution2();
    }

    @Test
    public void test1() {
        mines = new int[][] {{0, 1}, {1, 0}, {1, 1}};
        assertEquals(1, solution1.orderOfLargestPlusSign(2, mines));
        assertEquals(1, solution2.orderOfLargestPlusSign(2, mines));
        assertEquals(1, solution2.orderOfLargestPlusSign_initialVersion(2, mines));
    }

    @Test
    public void test2() {
        mines = new int[][] {{4, 2}};
        assertEquals(2, solution1.orderOfLargestPlusSign(5, mines));
        assertEquals(2, solution2.orderOfLargestPlusSign(5, mines));
        assertEquals(2, solution2.orderOfLargestPlusSign_initialVersion(5, mines));
    }
}
