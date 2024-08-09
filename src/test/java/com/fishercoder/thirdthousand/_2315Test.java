package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2315;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2315Test {
    private _2315.Solution1 solution1;
    private static String s;

    @BeforeEach
    public void setup() {
        solution1 = new _2315.Solution1();
    }

    @Test
    public void test1() {
        s = "l|*e*et|c**o|*de|";
        assertEquals(2, solution1.countAsterisks(s));
    }

}