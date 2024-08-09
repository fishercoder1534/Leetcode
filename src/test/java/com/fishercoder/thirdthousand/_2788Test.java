package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2788;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2788Test {
    private _2788.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2788.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("one", "two", "three", "four", "five", "six"), solution1.splitWordsBySeparator(Arrays.asList("one.two.three", "four.five", "six"), '.'));
    }
}
