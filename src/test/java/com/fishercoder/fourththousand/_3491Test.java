package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3491;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3491Test {
    private _3491.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3491.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.phonePrefix(new String[]{"1", "2", "4", "3"}));
    }
}
