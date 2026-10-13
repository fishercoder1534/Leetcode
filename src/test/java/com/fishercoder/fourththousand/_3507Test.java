package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3507;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3507Test {
    private _3507.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3507.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minimumPairRemoval(new int[]{5, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(9, solution1.minimumPairRemoval(new int[]{2, 2, -1, 3, -2, 2, 1, 1, 1, 0, -1}));
    }

}
