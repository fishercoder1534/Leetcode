package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1180;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1180Test {
    private _1180.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1180.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.countLetters("aaaba"));
    }

    @Test
    public void test2() {
        assertEquals(55, solution1.countLetters("aaaaaaaaaa"));
    }
}
