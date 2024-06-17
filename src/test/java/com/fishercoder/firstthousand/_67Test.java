package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._67;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _67Test {
    private static _67.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _67.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("100", solution1.addBinary("11", "1"));
    }
}
