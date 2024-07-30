package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2839;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _2839Test {
    private static _2839.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2839.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.canBeEqual("bnxw", "bwxn"));
    }
}
