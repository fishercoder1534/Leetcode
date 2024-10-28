package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3280;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3280Test {
    private _3280.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3280.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("100000100000-10-11101", solution1.convertDateToBinary("2080-02-29"));
    }
}
