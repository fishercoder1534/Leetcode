package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._334;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _334Test {
    private _334.Solution1 solution1;
    private _334.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _334.Solution1();
        solution2 = new _334.Solution2();
    }

    @Test
    public void test1() {
        assertTrue(solution1.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertTrue(solution2.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    public void test2() {
        assertFalse(solution1.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertFalse(solution2.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertFalse(solution1.increasingTriplet(new int[]{1, 1, -2, 6}));
        assertFalse(solution2.increasingTriplet(new int[]{1, 1, -2, 6}));
    }

    @Test
    public void test4() {
        assertFalse(solution1.increasingTriplet(new int[]{1, 1, 1, 1, 1, 1, 1}));
        assertFalse(solution2.increasingTriplet(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

}
