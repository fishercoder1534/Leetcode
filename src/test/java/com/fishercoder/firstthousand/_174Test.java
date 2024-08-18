package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._174;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _174Test {
    private _174.Solution1 solution1;
    private int[][] dungeon;

    @BeforeEach
    public void setUp() {
        solution1 = new _174.Solution1();
    }

    @Test
    public void test1() {
        dungeon = new int[][] {{0}};
        assertEquals(1, solution1.calculateMinimumHP(dungeon));
    }

    @Test
    public void test2() {
        dungeon = new int[][] {{-200}};
        assertEquals(201, solution1.calculateMinimumHP(dungeon));
    }
}
