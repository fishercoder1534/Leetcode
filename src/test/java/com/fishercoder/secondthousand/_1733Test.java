package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1733;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1733Test {
    private _1733.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1733.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                1,
                solution1.minimumTeachings(
                        2, new int[][] {{1}, {2}, {1, 2}}, new int[][] {{1, 2}, {1, 3}, {2, 3}}));
    }

    @Test
    public void test2() {
        assertEquals(
                2,
                solution1.minimumTeachings(
                        3,
                        new int[][] {{2}, {1, 3}, {1, 2}, {3}},
                        new int[][] {{1, 4}, {1, 2}, {3, 4}, {2, 3}}));
    }
}
