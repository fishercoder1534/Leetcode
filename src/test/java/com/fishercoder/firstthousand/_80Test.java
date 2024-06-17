package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._80;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _80Test {
    private static _80.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _80.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, (solution1.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3})));
    }

}
