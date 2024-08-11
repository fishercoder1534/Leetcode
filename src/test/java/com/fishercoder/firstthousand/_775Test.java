package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._775;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _775Test {
    private _775.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _775.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isIdealPermutation(new int[]{0, 1}));
    }

}