package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1869;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1869Test {
    private _1869.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1869.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkZeroOnes("1101"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.checkZeroOnes("111000"));
    }

}