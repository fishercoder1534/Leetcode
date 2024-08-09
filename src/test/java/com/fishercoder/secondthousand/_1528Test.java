package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1528;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1528Test {
    private _1528.Solution1 solution1;
    private static int[] indices;

    @BeforeEach
    public void setup() {
        solution1 = new _1528.Solution1();
    }

    @Test
    public void test1() {
        indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        assertEquals("leetcode", solution1.restoreString("codeleet", indices));
    }

}