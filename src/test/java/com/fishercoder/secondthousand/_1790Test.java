package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1790;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1790Test {
    private _1790.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1790.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.areAlmostEqual("a", "z"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.areAlmostEqual("bank", "kanb"));
    }
}
