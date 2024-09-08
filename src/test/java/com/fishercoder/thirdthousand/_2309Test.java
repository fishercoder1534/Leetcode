package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2309;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2309Test {
    private _2309.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2309.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("E", solution1.greatestLetter("lEeTcOdE"));
    }

    @Test
    public void test2() {
        assertEquals("R", solution1.greatestLetter("arRAzFif"));
    }
}
