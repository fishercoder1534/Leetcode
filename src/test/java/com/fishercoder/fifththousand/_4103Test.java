package com.fishercoder.fifththousand;

import com.fishercoder.solutions.fifththousand._4103;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _4103Test {
    private _4103.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4103.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.canRemoveAll(new int[]{0, 1, 1, 0}, new int[]{5, 3, 3, 5}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertFalse(solution1.canRemoveAll(new int[]{0, 1, 0}, new int[]{9, 9, 9}, new int[]{3, 2}));
    }

    @Test
    public void test3() {
        assertFalse(solution1.canRemoveAll(new int[]{2, 0, 1, 2}, new int[]{7, 5, 4, 7}, new int[]{3, 1, 2}));
    }

    @Test
    public void test4() {
        assertTrue(solution1.canRemoveAll(new int[]{2, 0, 2}, new int[]{1, 2, 1}, new int[]{1, 3, 1}));
    }
}