package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1688;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1688Test {
    private _1688.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1688.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.numberOfMatches(7));
    }
}
