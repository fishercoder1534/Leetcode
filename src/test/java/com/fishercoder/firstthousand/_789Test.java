package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._789;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by varunu28 on 1/01/19. */
public class _789Test {
    private _789.Solution test;

    @BeforeEach
    public void setup() {
        test = new _789.Solution();
    }

    @Test
    public void test1() {
        assertEquals(true, test.escapeGhosts(new int[][] {{1, 0}, {0, 3}}, new int[] {0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(false, test.escapeGhosts(new int[][] {{1, 0}}, new int[] {2, 0}));
    }

    @Test
    public void test3() {
        assertEquals(false, test.escapeGhosts(new int[][] {{2, 0}}, new int[] {1, 0}));
    }
}
