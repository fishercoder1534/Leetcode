package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._462;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _462Test {
    private _462.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _462.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minMoves2(new int[] {1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minMoves2(new int[] {1}));
    }
}
