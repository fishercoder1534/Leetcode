package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1753;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1753Test {
    private _1753.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1753.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maximumScore(1, 2, 6));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.maximumScore(6, 2, 1));
    }

}