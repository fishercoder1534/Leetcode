package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2717;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2717Test {
    private static _2717.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2717.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.semiOrderedPermutation(new int[]{2, 1, 4, 3}));
    }

}
