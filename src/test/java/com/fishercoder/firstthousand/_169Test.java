package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._169;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _169Test {
    private _169.Solution1 solution1;
    private _169.Solution2 solution2;
    private _169.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _169.Solution1();
        solution2 = new _169.Solution2();
        solution3 = new _169.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(
                1, solution1.majorityElement(new int[] {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
        assertEquals(
                1, solution2.majorityElement(new int[] {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
        assertEquals(
                1, solution3.majorityElement(new int[] {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
    }
}
