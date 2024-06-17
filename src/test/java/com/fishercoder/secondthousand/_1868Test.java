package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1868;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1868Test {
    private static _1868.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1868.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(Arrays.asList(6, 6)), solution1.findRLEArray(new int[][]{{1, 3}, {2, 3}}, new int[][]{{6, 3}, {3, 3}}));
    }

}
