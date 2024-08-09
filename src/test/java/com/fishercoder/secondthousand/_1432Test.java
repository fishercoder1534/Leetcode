package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1432;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1432Test {
    private _1432.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1432.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(888, solution1.maxDiff(555));
    }

}