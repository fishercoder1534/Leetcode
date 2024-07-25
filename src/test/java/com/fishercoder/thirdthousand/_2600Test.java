package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2600;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2600Test {
    private static _2600.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2600.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.kItemsWithMaximumSum(4, 2, 3, 7));
    }

}
