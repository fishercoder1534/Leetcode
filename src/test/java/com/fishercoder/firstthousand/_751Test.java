package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._751;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _751Test {
    private _751.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _751.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("255.0.0.7/32", "255.0.0.8/29", "255.0.0.16/32"), solution1.ipToCIDR("255.0.0.7", 10));
    }
}
