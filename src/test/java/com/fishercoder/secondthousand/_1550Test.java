package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1550;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1550Test {
    private _1550.Solution1 solution1;
    private static int[] arr;

    @BeforeEach
    public void setup() {
        solution1 = new _1550.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] {2, 6, 4, 1};
        assertEquals(false, solution1.threeConsecutiveOdds(arr));
    }
}
