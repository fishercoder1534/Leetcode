package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1523;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1523Test {
    private _1523.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1523.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countOdds(3, 7));
    }

}