package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1653;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1653Test {
    private static _1653.Solution1 solution1;
    private static _1653.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1653.Solution1();
        solution2 = new _1653.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minimumDeletions("aababbab"));
        assertEquals(2, solution2.minimumDeletions("aababbab"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minimumDeletions("aaabbb"));
        assertEquals(0, solution2.minimumDeletions("aaabbb"));
    }

}
