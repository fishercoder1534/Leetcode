package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._453;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _453Test {
    private _453.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _453.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minMoves(new int[] {1, 2, 3}));
    }
}
