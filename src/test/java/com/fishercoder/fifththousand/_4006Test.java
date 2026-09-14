package com.fishercoder.fifththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fifththousand._4006;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _4006Test {
    private _4006.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4006.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countValidPrefixes("101"));
    }
}
