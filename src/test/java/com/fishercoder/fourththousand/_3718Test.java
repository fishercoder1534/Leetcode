package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3718;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3718Test {
    private _3718.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3718.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.missingMultiple(new int[]{8, 2, 3, 4, 6}, 2));
    }

    @Test
    public void test2() {
        assertEquals(70, solution1.missingMultiple(new int[]{24}, 70));
    }

}
