package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1349;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1349Test {
    private _1349.Solution1 solution1;
    private static char[][] seats;

    @BeforeEach
    public void setup() {
        solution1 = new _1349.Solution1();
    }

    @Test
    public void test1() {
        seats =
                new char[][] {
                    {'#', '.', '#', '#', '.', '#'},
                    {'.', '#', '#', '#', '#', '.'},
                    {'#', '.', '#', '#', '.', '#'}
                };
        assertEquals(4, solution1.maxStudents(seats));
    }
}
