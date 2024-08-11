package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1422;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1422Test {
    private _1422.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1422.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.maxScore("011101"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.maxScore("00111"));
    }

}