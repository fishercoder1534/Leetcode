package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2578;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2578Test {
    private _2578.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2578.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(59, solution1.splitNum(4325));
    }

}