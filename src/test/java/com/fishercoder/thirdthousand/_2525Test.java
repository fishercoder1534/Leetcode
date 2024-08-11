package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2525;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2525Test {
    private _2525.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2525.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Both", solution1.categorizeBox(2909, 3968, 3272, 727));
    }

}