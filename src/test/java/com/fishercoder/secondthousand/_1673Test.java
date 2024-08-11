package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1673;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1673Test {
    private _1673.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1673.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 6}, solution1.mostCompetitive(new int[]{3, 5, 2, 6}, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 3, 3, 4}, solution1.mostCompetitive(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4));
    }

}