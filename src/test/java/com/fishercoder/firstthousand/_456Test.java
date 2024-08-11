package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._456;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _456Test {
    private _456.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _456.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.find132pattern(new int[]{-1, 3, 2, 0}));

    }

}
