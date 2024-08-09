package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3079;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3079Test {
    private _3079.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3079.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.sumOfEncryptedInt(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(66, solution1.sumOfEncryptedInt(new int[]{10, 21, 31}));
    }
}