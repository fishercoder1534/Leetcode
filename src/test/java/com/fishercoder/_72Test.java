package com.fishercoder;

import com.fishercoder.solutions._72;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _72Test {
    private static _72.Solution1 solution1;
    private static _72.Solution2 solution2;


    @BeforeEach
    public void setup() {
        solution1 = new _72.Solution1();
        solution2 = new _72.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minDistance("Ada", "Adam"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.minDistance("Ashmi", "Chheda"));
    }

    @Test
    public void test3() {
        assertEquals(1, solution2.minDistance("Ada", "Adam"));
    }

    @Test
    public void test4() {
        assertEquals(5, solution2.minDistance("Ashmi", "Chheda"));
    }
}
