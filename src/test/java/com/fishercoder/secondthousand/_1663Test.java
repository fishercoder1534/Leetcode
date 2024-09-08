package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1663;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1663Test {
    private _1663.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1663.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("aay", solution1.getSmallestString(3, 27));
    }

    @Test
    public void test2() {
        assertEquals("aaszz", solution1.getSmallestString(5, 73));
    }
}
