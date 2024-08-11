package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1090;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1090Test {
    private _1090.Solution1 solution1;

    @BeforeEach
    public void setupForEachTest() {
        solution1 = new _1090.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.largestValsFromLabels(new int[]{5, 4, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}, 3, 1));
    }

}
