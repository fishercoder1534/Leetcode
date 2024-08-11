package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1754;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1754Test {
    private _1754.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1754.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cbcabaaaaa", solution1.largestMerge("cabaa", "bcaaa"));
    }

}