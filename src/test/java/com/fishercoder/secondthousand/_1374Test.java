package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1374;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1374Test {
    private _1374.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1374.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.generateTheString(1).length());
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.generateTheString(4).length());
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.generateTheString(2).length());
    }

    @Test
    public void test4() {
        assertEquals(7, solution1.generateTheString(7).length());
    }
}
