package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2843;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2843Test {
    private _2843.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2843.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.countSymmetricIntegers(1, 100));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.countSymmetricIntegers(10, 100));
    }

}
