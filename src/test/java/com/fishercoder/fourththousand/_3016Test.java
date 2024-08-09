package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3016;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3016Test {
    private _3016.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3016.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(24, solution1.minimumPushes("aabbccddeeffgghhiiiiii"));
    }
}