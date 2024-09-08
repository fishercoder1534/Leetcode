package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._202;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _202Test {
    private _202.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _202.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isHappy(7));
    }
}
