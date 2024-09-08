package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._269;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _269Test {
    private _269.Solution1 solution1;
    private static String[] words;

    @BeforeEach
    public void setup() {
        solution1 = new _269.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"wrt", "wrf", "er", "ett", "rftt"};
        assertEquals("wertf", solution1.alienOrder(words));
    }

    @Test
    public void test2() {
        words = new String[] {"abc", "ab"};
        assertEquals("", solution1.alienOrder(words));
    }
}
