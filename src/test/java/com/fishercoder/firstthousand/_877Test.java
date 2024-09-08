package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._877;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _877Test {
    private _877.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _877.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.stoneGame(new int[] {5, 3, 4, 5}));
    }
}
