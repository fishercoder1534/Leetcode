package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2696;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2696Test {
    private _2696.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2696.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minLength("ABFCACDB"));
    }

}