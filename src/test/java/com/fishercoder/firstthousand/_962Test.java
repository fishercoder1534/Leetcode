package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._962;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _962Test {
    private _962.Solution1 solution1;
    private _962.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _962.Solution1();
        solution2 = new _962.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.maxWidthRamp(new int[]{1, 0}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution2.maxWidthRamp(new int[]{1, 0}));
    }

}