package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._50;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _50Test {
    private static _50.Solution1 solution1;
    private static _50.Solution2 solution2;
    private static _50.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _50.Solution1();
        solution2 = new _50.Solution2();
        solution3 = new _50.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(1024.00000, solution1.myPow(2.00000, 10), 0.00001);
        assertEquals(1024.00000, solution2.myPow(2.00000, 10), 0.00001);
        assertEquals(1024.00000, solution3.myPow(2.00000, 10), 0.00001);
    }
}
