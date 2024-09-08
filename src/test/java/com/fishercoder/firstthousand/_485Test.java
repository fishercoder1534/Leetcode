package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._485;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _485Test {
    private _485.Solution1 solution1;
    private _485.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _485.Solution1();
        solution2 = new _485.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
        assertEquals(3, solution2.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
    }
}
