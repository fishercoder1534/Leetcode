package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._802;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _802Test {
    private _802.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _802.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 4, 5, 6), solution1.eventualSafeNodes(new int[][]{
                {1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}
        }));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(4), solution1.eventualSafeNodes(new int[][]{
                {1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}
        }));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(0, 1, 2, 3, 4), solution1.eventualSafeNodes(new int[][]{
                {}, {0, 2, 3, 4}, {3}, {4}, {}
        }));
    }
}
