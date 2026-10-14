package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3622;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class _3622Test {
    private _3622.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3622.Solution1();
    }

    @Test
    public void test1() {
        assertFalse(solution1.checkDivisibility(8));
    }

}
