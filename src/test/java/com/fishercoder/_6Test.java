package com.fishercoder;

import com.fishercoder.solutions.firstthousand._6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _6Test {
    private static _6.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _6.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("PAHNAPLSIIGYIR", solution1.convert("PAYPALISHIRING", 3));
    }

}