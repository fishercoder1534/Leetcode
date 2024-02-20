package com.fishercoder;

import com.fishercoder.solutions._50;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _50Test {
    private static _50.Solution1 solution1;
    private static _50.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _50.Solution1();
        solution2 = new _50.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1024.00000, solution1.myPow(2.00000, 10), 0.00001);
        assertEquals(1024.00000, solution2.myPow(2.00000, 10), 0.00001);
    }
}
