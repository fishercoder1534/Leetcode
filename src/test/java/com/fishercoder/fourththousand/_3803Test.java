package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3803;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3803Test {
    private _3803.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3803.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.residuePrefixes("bbbb"));
    }

}
