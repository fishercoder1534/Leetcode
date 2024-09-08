package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._402;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _402Test {
    private _402.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _402.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("1219", solution1.removeKdigits("1432219", 3));
    }
}
