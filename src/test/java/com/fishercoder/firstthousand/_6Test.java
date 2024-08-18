package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _6Test {
    private _6.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _6.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("PAHNAPLSIIGYIR", solution1.convert("PAYPALISHIRING", 3));
    }
}
