package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._821;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _821Test {
    private static _821.Solution1 solution1;
    private static _821.Solution2 solution2;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _821.Solution1();
        solution2 = new _821.Solution2();
    }

    @Test
    public void test1() {
        expected = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(expected, solution1.shortestToChar("loveleetcode", 'e'));
    }

    @Test
    public void test2() {
        expected = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(expected, solution2.shortestToChar("loveleetcode", 'e'));
    }
}
