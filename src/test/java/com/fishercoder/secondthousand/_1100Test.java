package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1100;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1100Test {
    private _1100.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1100.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.numKLenSubstrNoRepeats("havefunonleetcode", 5));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numKLenSubstrNoRepeats("home", 5));
    }
}
