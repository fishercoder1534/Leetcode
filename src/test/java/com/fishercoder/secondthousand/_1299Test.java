package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1299;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1299Test {
    private _1299.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1299.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{17, 18, 5, 4, 6, 1};
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution1.replaceElements(arr));
    }

}