package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1387;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1387Test {
    private _1387.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1387.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.getKth(12, 15, 2));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.getKth(1, 1, 1));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.getKth(7, 11, 4));
    }
}
