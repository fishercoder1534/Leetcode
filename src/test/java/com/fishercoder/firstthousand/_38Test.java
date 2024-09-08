package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._38;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _38Test {
    private _38.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _38.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("21", solution1.countAndSay(3));
    }
}
