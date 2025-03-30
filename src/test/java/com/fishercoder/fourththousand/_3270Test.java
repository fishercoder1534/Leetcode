package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3270;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3270Test {
    private _3270.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3270.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.generateKey(1, 10, 1000));
    }
}
