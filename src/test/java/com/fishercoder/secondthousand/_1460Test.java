package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1460;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1460Test {
    private _1460.Solution1 solution1;
    private static int[] target;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1460.Solution1();
    }

    @Test
    public void test1() {
        target = new int[]{1, 2, 3, 4};
        arr = new int[]{2, 4, 1, 3};
        assertEquals(true, solution1.canBeEqual(target, arr));
    }

}