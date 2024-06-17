package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._52;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _52Test {
    private static _52.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _52.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.totalNQueens(1));
    }

    @Test
    public void test2() {
        assertEquals(92, solution1.totalNQueens(8));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.totalNQueens(2));
    }
}
