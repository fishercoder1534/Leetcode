package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._664;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _664Test {
    private _664.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _664.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.strangePrinter("aaabbb"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.strangePrinter("aba"));
    }
}
