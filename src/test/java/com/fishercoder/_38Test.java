package com.fishercoder;

import com.fishercoder.solutions._38;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _38Test {
    private static _38.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _38.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("21", solution1.countAndSay(3));
    }
}
