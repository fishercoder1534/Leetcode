package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1466;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1466Test {
    private _1466.Solution1 solution1;
    private _1466.Solution2 solution2;
    private static int[][] connections;

    @BeforeEach
    public void setup() {
        solution1 = new _1466.Solution1();
        solution2 = new _1466.Solution2();
    }

    @Test
    public void test1() {
        connections = new int[][] {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        assertEquals(3, solution1.minReorder(6, connections));
    }

    @Test
    public void test2() {
        connections = new int[][] {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        assertEquals(3, solution2.minReorder(6, connections));
    }
}
