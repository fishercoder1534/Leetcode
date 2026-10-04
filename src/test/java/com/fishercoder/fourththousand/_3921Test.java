package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3921;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3921Test {
    private _3921.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3921.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 10}, solution1.scoreValidator(new String[]{"W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"}));
    }
}
