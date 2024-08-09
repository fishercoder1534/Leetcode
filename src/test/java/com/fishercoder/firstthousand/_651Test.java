package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._651;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _651Test {
    private _651.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _651.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.maxA(3));
    }

    @Test
    public void test2() {
        assertEquals(324, solution1.maxA(20));
    }

    @Test
    public void test3() {
        assertEquals(256, solution1.maxA(19));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.maxA(1));
    }

    @Test
    public void test5() {
        assertEquals(1327104, solution1.maxA(50));
    }

    @Test
    public void test6() {
        assertEquals(9, solution1.maxA(7));
    }
}
