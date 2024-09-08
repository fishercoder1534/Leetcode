package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._397;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _397Test {
    private _397.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _397.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(17, solution1.integerReplacement(65535));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.integerReplacement(1234));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.integerReplacement(5));
    }
}
