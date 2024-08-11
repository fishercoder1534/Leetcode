package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._326;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _326Test {
    private _326.Solution1 solution1;
    private _326.Solution2 solution2;
    private _326.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _326.Solution1();
        solution2 = new _326.Solution2();
        solution3 = new _326.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPowerOfThree(12));
        assertEquals(false, solution2.isPowerOfThree(12));
        assertEquals(false, solution3.isPowerOfThree(12));
    }

}