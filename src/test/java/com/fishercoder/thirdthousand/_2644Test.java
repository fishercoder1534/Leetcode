package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2644;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2644Test {
    private _2644.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2644.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.maxDivScore(new int[]{2, 9, 15, 50}, new int[]{5, 3, 7, 2}));
    }


}
