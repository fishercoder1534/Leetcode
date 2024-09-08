package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3074;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3074Test {
    private _3074.Solution1 solution1;
    private static int[] apple;
    private static int[] capacity;

    @BeforeEach
    public void setup() {
        solution1 = new _3074.Solution1();
    }

    @Test
    public void test1() {
        apple = new int[] {1, 3, 2};
        capacity = new int[] {4, 3, 1, 5, 2};
        assertEquals(2, solution1.minimumBoxes(apple, capacity));
    }
}
