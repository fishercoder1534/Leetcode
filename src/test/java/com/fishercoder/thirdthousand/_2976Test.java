package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2976;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2976Test {
    private static _2976.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2976.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(28, solution1.minimumCost
                ("abcd", "acbe",
                        new char[]{'a', 'b', 'c', 'c', 'e', 'd'},
                        new char[]{'b', 'c', 'b', 'e', 'b', 'e'},
                        new int[]{2, 5, 5, 1, 2, 20}));
    }

    @Test
    public void test2() {
        assertEquals(12, solution1.minimumCost
                ("aaaa", "bbbb",
                        new char[]{'a', 'c'},
                        new char[]{'c', 'b'},
                        new int[]{1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.minimumCost
                ("abcd", "abce",
                        new char[]{'a'},
                        new char[]{'e'},
                        new int[]{10000}));
    }
}
