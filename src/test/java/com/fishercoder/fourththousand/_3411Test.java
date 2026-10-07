package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3411;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3411Test {
    private _3411.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3411.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.maxLength(new int[]{1, 2, 1, 2, 1, 1, 1}));
    }

}
