package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1424;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1424Test {
    private static _1424.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1424.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9}, solution1.findDiagonalOrder(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList(7, 8, 9)
                ))
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16}, solution1.findDiagonalOrder(
                Arrays.asList(
                        Arrays.asList(1, 2, 3, 4, 5),
                        Arrays.asList(6, 7),
                        Arrays.asList(8),
                        Arrays.asList(9, 10, 11),
                        Arrays.asList(12, 13, 14, 15, 16)
                ))
        );
    }

}