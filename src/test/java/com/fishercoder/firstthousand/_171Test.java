package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._171;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _171Test {
    private _171.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _171.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(28, solution1.titleToNumber("AB"));
    }
}
