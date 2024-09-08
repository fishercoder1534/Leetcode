package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2917;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2917Test {
    private _2917.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2917.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.findKOr(new int[] {7, 12, 9, 8, 9, 15}, 4));
    }
}
