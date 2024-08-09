package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2492;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2492Test {
    private _2492.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2492.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.minScore(4, new int[][]{{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}}));
    }

    @Test
    public void test2() {
        assertEquals(1885, solution1.minScore(6, new int[][]{{4, 5, 7468}, {6, 2, 7173}, {6, 3, 8365}, {2, 3, 7674}, {5, 6, 7852}, {1, 2, 8547}, {2, 4, 1885}, {2, 5, 5192}, {1, 3, 4065}, {1, 4, 7357}}));
    }

}