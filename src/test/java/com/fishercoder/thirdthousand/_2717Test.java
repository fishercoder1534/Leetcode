package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2717;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2717Test {
    private _2717.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2717.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.semiOrderedPermutation(new int[] {2, 1, 4, 3}));
    }
}
