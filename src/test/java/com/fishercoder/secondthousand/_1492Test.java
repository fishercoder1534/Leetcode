package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1492;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1492Test {
    private _1492.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1492.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.kthFactor(12, 3));
    }
}
