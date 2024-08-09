package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1427;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1427Test {
    private _1427.Solution1 solution1;
    private static int[][] shift;

    @BeforeEach
    public void setup() {
        solution1 = new _1427.Solution1();
    }

    @Test
    public void test1() {
        shift = new int[][]{
                {0, 1},
                {1, 2},
        };
        assertEquals("cab", solution1.stringShift("abc", shift));
    }

}