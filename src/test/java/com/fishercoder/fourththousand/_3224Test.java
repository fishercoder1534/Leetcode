package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3224;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3224Test {
    private _3224.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3224.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minChanges(new int[] {1, 0, 1, 2, 4, 3}, 4));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minChanges(new int[] {18, 10, 14, 18, 17, 2, 11, 5}, 19));
    }

    @Test
    public void test3() {
        assertEquals(
                4, solution1.minChanges(new int[] {9, 2, 7, 7, 8, 9, 1, 5, 1, 9, 4, 9, 4, 7}, 9));
    }

    @Test
    public void test4() {
        assertEquals(
                7,
                solution1.minChanges(
                        new int[] {
                            1, 1, 1, 1, 0, 0, 0, 5, 4, 3, 19, 17, 16, 15, 15, 15, 19, 19, 19, 19
                        },
                        20));
    }
}
