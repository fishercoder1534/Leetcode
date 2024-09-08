package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2437;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2437Test {
    private _2437.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2437.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1440, solution1.countTime("??:??"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.countTime("?2:16"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.countTime("?5:00"));
    }
}
