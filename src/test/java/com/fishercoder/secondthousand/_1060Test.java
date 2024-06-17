package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1060;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1060Test {
    private static _1060.Solution1 solution1;
    private static _1060.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1060.Solution1();
        solution2 = new _1060.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.missingElement(new int[]{4, 7, 9, 10}, 1));
        assertEquals(5, solution2.missingElement(new int[]{4, 7, 9, 10}, 1));
    }

    @Test
    public void test2() {
        assertEquals(8, solution1.missingElement(new int[]{4, 7, 9, 10}, 3));
        assertEquals(8, solution2.missingElement(new int[]{4, 7, 9, 10}, 3));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.missingElement(new int[]{1, 2, 4}, 3));
        assertEquals(6, solution2.missingElement(new int[]{1, 2, 4}, 3));
    }
}
