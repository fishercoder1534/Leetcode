package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1417;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1417Test {
    private _1417.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1417.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("0a1b2c", solution1.reformat("a0b1c2"));
    }

    @Test
    public void test2() {
        assertEquals("c2o0v1i9d", solution1.reformat("covid2019"));
    }
}
