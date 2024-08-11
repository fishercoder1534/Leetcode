package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._96;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _96Test {
    private _96.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _96.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numTrees(3));
    }

}
