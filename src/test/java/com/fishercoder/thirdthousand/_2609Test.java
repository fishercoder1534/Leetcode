package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2609;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2609Test {
    private _2609.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2609.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.findTheLongestBalancedSubstring("01000111"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.findTheLongestBalancedSubstring("001"));
    }

}
