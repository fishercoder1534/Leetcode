package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3861;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3861Test {
    private _3861.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3861.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minimumIndex(new int[]{1, 5, 3, 7}, 3));
    }
}
