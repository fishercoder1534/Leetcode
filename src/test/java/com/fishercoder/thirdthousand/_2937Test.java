package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2937;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2937Test {
    private _2937.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2937.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findMinimumOperations("abc", "abb", "ab"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.findMinimumOperations("a", "aabc", "a"));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.findMinimumOperations("ca", "cccabb", "cb"));
    }
}
