package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._806;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _806Test {
    private _806.Solution1 solution1;
    private static int[] widths;

    @BeforeEach
    public void setUp() {
        solution1 = new _806.Solution1();
    }

    @Test
    public void test1() {
        widths =
                new int[] {
                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10
                };
        assertArrayEquals(
                new int[] {3, 60}, solution1.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        widths =
                new int[] {
                    4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10
                };
        assertArrayEquals(new int[] {2, 4}, solution1.numberOfLines(widths, "bbbcccdddaaa"));
    }
}
